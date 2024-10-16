// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: roasting_outtake.proto

package backend.test.coffee_roasting.grpc.roasting_outtake;

/**
 * Protobuf type {@code RoastingOuttakeRequest}
 */
public final class RoastingOuttakeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RoastingOuttakeRequest)
    RoastingOuttakeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoastingOuttakeRequest.newBuilder() to construct.
  private RoastingOuttakeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoastingOuttakeRequest() {
    grainType_ = "";
    originCountry_ = "";
    brigadeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RoastingOuttakeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return RoastingOuttakeProto.internal_static_RoastingOuttakeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return RoastingOuttakeProto.internal_static_RoastingOuttakeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RoastingOuttakeRequest.class, RoastingOuttakeRequest.Builder.class);
  }

  public static final int GRAIN_TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object grainType_ = "";
  /**
   * <code>string grain_type = 1;</code>
   * @return The grainType.
   */
  @java.lang.Override
  public java.lang.String getGrainType() {
    java.lang.Object ref = grainType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      grainType_ = s;
      return s;
    }
  }
  /**
   * <code>string grain_type = 1;</code>
   * @return The bytes for grainType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGrainTypeBytes() {
    java.lang.Object ref = grainType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      grainType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORIGIN_COUNTRY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object originCountry_ = "";
  /**
   * <code>string origin_country = 2;</code>
   * @return The originCountry.
   */
  @java.lang.Override
  public java.lang.String getOriginCountry() {
    java.lang.Object ref = originCountry_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      originCountry_ = s;
      return s;
    }
  }
  /**
   * <code>string origin_country = 2;</code>
   * @return The bytes for originCountry.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOriginCountryBytes() {
    java.lang.Object ref = originCountry_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      originCountry_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INPUT_WEIGHT_GRAMS_FIELD_NUMBER = 3;
  private double inputWeightGrams_ = 0D;
  /**
   * <code>double input_weight_grams = 3;</code>
   * @return The inputWeightGrams.
   */
  @java.lang.Override
  public double getInputWeightGrams() {
    return inputWeightGrams_;
  }

  public static final int OUTPUT_WEIGHT_GRAMS_FIELD_NUMBER = 4;
  private double outputWeightGrams_ = 0D;
  /**
   * <code>double output_weight_grams = 4;</code>
   * @return The outputWeightGrams.
   */
  @java.lang.Override
  public double getOutputWeightGrams() {
    return outputWeightGrams_;
  }

  public static final int BRIGADE_ID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object brigadeId_ = "";
  /**
   * <code>string brigade_id = 5;</code>
   * @return The brigadeId.
   */
  @java.lang.Override
  public java.lang.String getBrigadeId() {
    java.lang.Object ref = brigadeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      brigadeId_ = s;
      return s;
    }
  }
  /**
   * <code>string brigade_id = 5;</code>
   * @return The bytes for brigadeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBrigadeIdBytes() {
    java.lang.Object ref = brigadeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      brigadeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(grainType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, grainType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(originCountry_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, originCountry_);
    }
    if (java.lang.Double.doubleToRawLongBits(inputWeightGrams_) != 0) {
      output.writeDouble(3, inputWeightGrams_);
    }
    if (java.lang.Double.doubleToRawLongBits(outputWeightGrams_) != 0) {
      output.writeDouble(4, outputWeightGrams_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(brigadeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, brigadeId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(grainType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, grainType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(originCountry_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, originCountry_);
    }
    if (java.lang.Double.doubleToRawLongBits(inputWeightGrams_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, inputWeightGrams_);
    }
    if (java.lang.Double.doubleToRawLongBits(outputWeightGrams_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, outputWeightGrams_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(brigadeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, brigadeId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof RoastingOuttakeRequest)) {
      return super.equals(obj);
    }
    RoastingOuttakeRequest other = (RoastingOuttakeRequest) obj;

    if (!getGrainType()
        .equals(other.getGrainType())) return false;
    if (!getOriginCountry()
        .equals(other.getOriginCountry())) return false;
    if (java.lang.Double.doubleToLongBits(getInputWeightGrams())
        != java.lang.Double.doubleToLongBits(
            other.getInputWeightGrams())) return false;
    if (java.lang.Double.doubleToLongBits(getOutputWeightGrams())
        != java.lang.Double.doubleToLongBits(
            other.getOutputWeightGrams())) return false;
    if (!getBrigadeId()
        .equals(other.getBrigadeId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GRAIN_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getGrainType().hashCode();
    hash = (37 * hash) + ORIGIN_COUNTRY_FIELD_NUMBER;
    hash = (53 * hash) + getOriginCountry().hashCode();
    hash = (37 * hash) + INPUT_WEIGHT_GRAMS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getInputWeightGrams()));
    hash = (37 * hash) + OUTPUT_WEIGHT_GRAMS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getOutputWeightGrams()));
    hash = (37 * hash) + BRIGADE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBrigadeId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RoastingOuttakeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RoastingOuttakeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RoastingOuttakeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RoastingOuttakeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RoastingOuttakeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RoastingOuttakeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RoastingOuttakeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RoastingOuttakeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static RoastingOuttakeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static RoastingOuttakeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RoastingOuttakeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RoastingOuttakeRequest parseFrom(
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
  public static Builder newBuilder(RoastingOuttakeRequest prototype) {
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
   * Protobuf type {@code RoastingOuttakeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RoastingOuttakeRequest)
          RoastingOuttakeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RoastingOuttakeProto.internal_static_RoastingOuttakeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RoastingOuttakeProto.internal_static_RoastingOuttakeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RoastingOuttakeRequest.class, RoastingOuttakeRequest.Builder.class);
    }

    // Construct using backend.test.coffee_roasting.grpc.roasting_outtake.RoastingOuttakeRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      grainType_ = "";
      originCountry_ = "";
      inputWeightGrams_ = 0D;
      outputWeightGrams_ = 0D;
      brigadeId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return RoastingOuttakeProto.internal_static_RoastingOuttakeRequest_descriptor;
    }

    @java.lang.Override
    public RoastingOuttakeRequest getDefaultInstanceForType() {
      return RoastingOuttakeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public RoastingOuttakeRequest build() {
      RoastingOuttakeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public RoastingOuttakeRequest buildPartial() {
      RoastingOuttakeRequest result = new RoastingOuttakeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(RoastingOuttakeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.grainType_ = grainType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.originCountry_ = originCountry_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.inputWeightGrams_ = inputWeightGrams_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.outputWeightGrams_ = outputWeightGrams_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.brigadeId_ = brigadeId_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof RoastingOuttakeRequest) {
        return mergeFrom((RoastingOuttakeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RoastingOuttakeRequest other) {
      if (other == RoastingOuttakeRequest.getDefaultInstance()) return this;
      if (!other.getGrainType().isEmpty()) {
        grainType_ = other.grainType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOriginCountry().isEmpty()) {
        originCountry_ = other.originCountry_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getInputWeightGrams() != 0D) {
        setInputWeightGrams(other.getInputWeightGrams());
      }
      if (other.getOutputWeightGrams() != 0D) {
        setOutputWeightGrams(other.getOutputWeightGrams());
      }
      if (!other.getBrigadeId().isEmpty()) {
        brigadeId_ = other.brigadeId_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              grainType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              originCountry_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 25: {
              inputWeightGrams_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
            case 33: {
              outputWeightGrams_ = input.readDouble();
              bitField0_ |= 0x00000008;
              break;
            } // case 33
            case 42: {
              brigadeId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object grainType_ = "";
    /**
     * <code>string grain_type = 1;</code>
     * @return The grainType.
     */
    public java.lang.String getGrainType() {
      java.lang.Object ref = grainType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        grainType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string grain_type = 1;</code>
     * @return The bytes for grainType.
     */
    public com.google.protobuf.ByteString
        getGrainTypeBytes() {
      java.lang.Object ref = grainType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        grainType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string grain_type = 1;</code>
     * @param value The grainType to set.
     * @return This builder for chaining.
     */
    public Builder setGrainType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      grainType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string grain_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGrainType() {
      grainType_ = getDefaultInstance().getGrainType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string grain_type = 1;</code>
     * @param value The bytes for grainType to set.
     * @return This builder for chaining.
     */
    public Builder setGrainTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      grainType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object originCountry_ = "";
    /**
     * <code>string origin_country = 2;</code>
     * @return The originCountry.
     */
    public java.lang.String getOriginCountry() {
      java.lang.Object ref = originCountry_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        originCountry_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string origin_country = 2;</code>
     * @return The bytes for originCountry.
     */
    public com.google.protobuf.ByteString
        getOriginCountryBytes() {
      java.lang.Object ref = originCountry_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        originCountry_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string origin_country = 2;</code>
     * @param value The originCountry to set.
     * @return This builder for chaining.
     */
    public Builder setOriginCountry(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      originCountry_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string origin_country = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOriginCountry() {
      originCountry_ = getDefaultInstance().getOriginCountry();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string origin_country = 2;</code>
     * @param value The bytes for originCountry to set.
     * @return This builder for chaining.
     */
    public Builder setOriginCountryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      originCountry_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private double inputWeightGrams_ ;
    /**
     * <code>double input_weight_grams = 3;</code>
     * @return The inputWeightGrams.
     */
    @java.lang.Override
    public double getInputWeightGrams() {
      return inputWeightGrams_;
    }
    /**
     * <code>double input_weight_grams = 3;</code>
     * @param value The inputWeightGrams to set.
     * @return This builder for chaining.
     */
    public Builder setInputWeightGrams(double value) {

      inputWeightGrams_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>double input_weight_grams = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearInputWeightGrams() {
      bitField0_ = (bitField0_ & ~0x00000004);
      inputWeightGrams_ = 0D;
      onChanged();
      return this;
    }

    private double outputWeightGrams_ ;
    /**
     * <code>double output_weight_grams = 4;</code>
     * @return The outputWeightGrams.
     */
    @java.lang.Override
    public double getOutputWeightGrams() {
      return outputWeightGrams_;
    }
    /**
     * <code>double output_weight_grams = 4;</code>
     * @param value The outputWeightGrams to set.
     * @return This builder for chaining.
     */
    public Builder setOutputWeightGrams(double value) {

      outputWeightGrams_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>double output_weight_grams = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOutputWeightGrams() {
      bitField0_ = (bitField0_ & ~0x00000008);
      outputWeightGrams_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object brigadeId_ = "";
    /**
     * <code>string brigade_id = 5;</code>
     * @return The brigadeId.
     */
    public java.lang.String getBrigadeId() {
      java.lang.Object ref = brigadeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        brigadeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string brigade_id = 5;</code>
     * @return The bytes for brigadeId.
     */
    public com.google.protobuf.ByteString
        getBrigadeIdBytes() {
      java.lang.Object ref = brigadeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brigadeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string brigade_id = 5;</code>
     * @param value The brigadeId to set.
     * @return This builder for chaining.
     */
    public Builder setBrigadeId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      brigadeId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string brigade_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBrigadeId() {
      brigadeId_ = getDefaultInstance().getBrigadeId();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string brigade_id = 5;</code>
     * @param value The bytes for brigadeId to set.
     * @return This builder for chaining.
     */
    public Builder setBrigadeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      brigadeId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RoastingOuttakeRequest)
  }

  // @@protoc_insertion_point(class_scope:RoastingOuttakeRequest)
  private static final RoastingOuttakeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RoastingOuttakeRequest();
  }

  public static RoastingOuttakeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoastingOuttakeRequest>
      PARSER = new com.google.protobuf.AbstractParser<RoastingOuttakeRequest>() {
    @java.lang.Override
    public RoastingOuttakeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RoastingOuttakeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoastingOuttakeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public RoastingOuttakeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

