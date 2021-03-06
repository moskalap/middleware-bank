package bank.exchange;

import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.logging.Logger;

public class Server {
    static {
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%1$tF %1$tT] [%4$-7s] %5$s %n");
    }
    private static final Logger logger = Logger.getLogger(Server.class.getName());


    private io.grpc.Server server;

    private void start(int port) throws IOException
    {
        server = ServerBuilder
                .forPort(port)
                .addService(new ExchangeServiceImpl())
                .build()
                .start();

        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                Server.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        if(args.length != 1){
            System.out.print("server port");
        }else{
            int port = Integer.valueOf(args[0]);
            final Server server = new Server();
            server.start(port);
            server.blockUntilShutdown();
        }

    }
}
