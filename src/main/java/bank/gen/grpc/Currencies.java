// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: currency.proto

package bank.gen.grpc;

/**
 * Protobuf type {@code currency.Currencies}
 */
public  final class Currencies extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:currency.Currencies)
    CurrenciesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Currencies.newBuilder() to construct.
  private Currencies(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Currencies() {
    currencies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Currencies(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              currencies_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            currencies_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                currencies_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              currencies_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        currencies_ = java.util.Collections.unmodifiableList(currencies_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bank.gen.grpc.CurrencyProto.internal_static_currency_Currencies_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bank.gen.grpc.CurrencyProto.internal_static_currency_Currencies_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bank.gen.grpc.Currencies.class, bank.gen.grpc.Currencies.Builder.class);
  }

  public static final int CURRENCIES_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> currencies_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, bank.gen.grpc.Currency> currencies_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, bank.gen.grpc.Currency>() {
            public bank.gen.grpc.Currency convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              bank.gen.grpc.Currency result = bank.gen.grpc.Currency.valueOf(from);
              return result == null ? bank.gen.grpc.Currency.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .currency.Currency currencies = 1;</code>
   */
  public java.util.List<bank.gen.grpc.Currency> getCurrenciesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, bank.gen.grpc.Currency>(currencies_, currencies_converter_);
  }
  /**
   * <code>repeated .currency.Currency currencies = 1;</code>
   */
  public int getCurrenciesCount() {
    return currencies_.size();
  }
  /**
   * <code>repeated .currency.Currency currencies = 1;</code>
   */
  public bank.gen.grpc.Currency getCurrencies(int index) {
    return currencies_converter_.convert(currencies_.get(index));
  }
  /**
   * <code>repeated .currency.Currency currencies = 1;</code>
   */
  public java.util.List<java.lang.Integer>
  getCurrenciesValueList() {
    return currencies_;
  }
  /**
   * <code>repeated .currency.Currency currencies = 1;</code>
   */
  public int getCurrenciesValue(int index) {
    return currencies_.get(index);
  }
  private int currenciesMemoizedSerializedSize;

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getCurrenciesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(currenciesMemoizedSerializedSize);
    }
    for (int i = 0; i < currencies_.size(); i++) {
      output.writeEnumNoTag(currencies_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < currencies_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(currencies_.get(i));
      }
      size += dataSize;
      if (!getCurrenciesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }currenciesMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof bank.gen.grpc.Currencies)) {
      return super.equals(obj);
    }
    bank.gen.grpc.Currencies other = (bank.gen.grpc.Currencies) obj;

    boolean result = true;
    result = result && currencies_.equals(other.currencies_);
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCurrenciesCount() > 0) {
      hash = (37 * hash) + CURRENCIES_FIELD_NUMBER;
      hash = (53 * hash) + currencies_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bank.gen.grpc.Currencies parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bank.gen.grpc.Currencies parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bank.gen.grpc.Currencies parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bank.gen.grpc.Currencies parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bank.gen.grpc.Currencies parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bank.gen.grpc.Currencies parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bank.gen.grpc.Currencies parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bank.gen.grpc.Currencies parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bank.gen.grpc.Currencies parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bank.gen.grpc.Currencies parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bank.gen.grpc.Currencies parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static bank.gen.grpc.Currencies parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(bank.gen.grpc.Currencies prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code currency.Currencies}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:currency.Currencies)
      bank.gen.grpc.CurrenciesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bank.gen.grpc.CurrencyProto.internal_static_currency_Currencies_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bank.gen.grpc.CurrencyProto.internal_static_currency_Currencies_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bank.gen.grpc.Currencies.class, bank.gen.grpc.Currencies.Builder.class);
    }

    // Construct using bank.gen.grpc.Currencies.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      currencies_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bank.gen.grpc.CurrencyProto.internal_static_currency_Currencies_descriptor;
    }

    @java.lang.Override
    public bank.gen.grpc.Currencies getDefaultInstanceForType() {
      return bank.gen.grpc.Currencies.getDefaultInstance();
    }

    @java.lang.Override
    public bank.gen.grpc.Currencies build() {
      bank.gen.grpc.Currencies result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public bank.gen.grpc.Currencies buildPartial() {
      bank.gen.grpc.Currencies result = new bank.gen.grpc.Currencies(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        currencies_ = java.util.Collections.unmodifiableList(currencies_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.currencies_ = currencies_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bank.gen.grpc.Currencies) {
        return mergeFrom((bank.gen.grpc.Currencies)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bank.gen.grpc.Currencies other) {
      if (other == bank.gen.grpc.Currencies.getDefaultInstance()) return this;
      if (!other.currencies_.isEmpty()) {
        if (currencies_.isEmpty()) {
          currencies_ = other.currencies_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCurrenciesIsMutable();
          currencies_.addAll(other.currencies_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      bank.gen.grpc.Currencies parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (bank.gen.grpc.Currencies) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> currencies_ =
      java.util.Collections.emptyList();
    private void ensureCurrenciesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        currencies_ = new java.util.ArrayList<java.lang.Integer>(currencies_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .currency.Currency currencies = 1;</code>
     */
    public java.util.List<bank.gen.grpc.Currency> getCurrenciesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, bank.gen.grpc.Currency>(currencies_, currencies_converter_);
    }
    /**
     * <code>repeated .currency.Currency currencies = 1;</code>
     */
    public int getCurrenciesCount() {
      return currencies_.size();
    }
    /**
     * <code>repeated .currency.Currency currencies = 1;</code>
     */
    public bank.gen.grpc.Currency getCurrencies(int index) {
      return currencies_converter_.convert(currencies_.get(index));
    }
    /**
     * <code>repeated .currency.Currency currencies = 1;</code>
     */
    public Builder setCurrencies(
        int index, bank.gen.grpc.Currency value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCurrenciesIsMutable();
      currencies_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .currency.Currency currencies = 1;</code>
     */
    public Builder addCurrencies(bank.gen.grpc.Currency value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCurrenciesIsMutable();
      currencies_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .currency.Currency currencies = 1;</code>
     */
    public Builder addAllCurrencies(
        java.lang.Iterable<? extends bank.gen.grpc.Currency> values) {
      ensureCurrenciesIsMutable();
      for (bank.gen.grpc.Currency value : values) {
        currencies_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .currency.Currency currencies = 1;</code>
     */
    public Builder clearCurrencies() {
      currencies_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .currency.Currency currencies = 1;</code>
     */
    public java.util.List<java.lang.Integer>
    getCurrenciesValueList() {
      return java.util.Collections.unmodifiableList(currencies_);
    }
    /**
     * <code>repeated .currency.Currency currencies = 1;</code>
     */
    public int getCurrenciesValue(int index) {
      return currencies_.get(index);
    }
    /**
     * <code>repeated .currency.Currency currencies = 1;</code>
     */
    public Builder setCurrenciesValue(
        int index, int value) {
      ensureCurrenciesIsMutable();
      currencies_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .currency.Currency currencies = 1;</code>
     */
    public Builder addCurrenciesValue(int value) {
      ensureCurrenciesIsMutable();
      currencies_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .currency.Currency currencies = 1;</code>
     */
    public Builder addAllCurrenciesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureCurrenciesIsMutable();
      for (int value : values) {
        currencies_.add(value);
      }
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:currency.Currencies)
  }

  // @@protoc_insertion_point(class_scope:currency.Currencies)
  private static final bank.gen.grpc.Currencies DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bank.gen.grpc.Currencies();
  }

  public static bank.gen.grpc.Currencies getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Currencies>
      PARSER = new com.google.protobuf.AbstractParser<Currencies>() {
    @java.lang.Override
    public Currencies parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Currencies(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Currencies> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Currencies> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public bank.gen.grpc.Currencies getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

