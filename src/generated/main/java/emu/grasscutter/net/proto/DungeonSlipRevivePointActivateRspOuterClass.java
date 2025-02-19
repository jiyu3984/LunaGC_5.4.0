// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonSlipRevivePointActivateRsp.proto

package emu.grasscutter.net.proto;

public final class DungeonSlipRevivePointActivateRspOuterClass {
  private DungeonSlipRevivePointActivateRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonSlipRevivePointActivateRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonSlipRevivePointActivateRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 slip_revive_point_id = 8;</code>
     * @return The slipRevivePointId.
     */
    int getSlipRevivePointId();
  }
  /**
   * Protobuf type {@code DungeonSlipRevivePointActivateRsp}
   */
  public static final class DungeonSlipRevivePointActivateRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonSlipRevivePointActivateRsp)
      DungeonSlipRevivePointActivateRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonSlipRevivePointActivateRsp.newBuilder() to construct.
    private DungeonSlipRevivePointActivateRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonSlipRevivePointActivateRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonSlipRevivePointActivateRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonSlipRevivePointActivateRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 40: {

              retcode_ = input.readInt32();
              break;
            }
            case 64: {

              slipRevivePointId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.internal_static_DungeonSlipRevivePointActivateRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.internal_static_DungeonSlipRevivePointActivateRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.class, emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SLIP_REVIVE_POINT_ID_FIELD_NUMBER = 8;
    private int slipRevivePointId_;
    /**
     * <code>uint32 slip_revive_point_id = 8;</code>
     * @return The slipRevivePointId.
     */
    @java.lang.Override
    public int getSlipRevivePointId() {
      return slipRevivePointId_;
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
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (slipRevivePointId_ != 0) {
        output.writeUInt32(8, slipRevivePointId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (slipRevivePointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, slipRevivePointId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp other = (emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getSlipRevivePointId()
          != other.getSlipRevivePointId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SLIP_REVIVE_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSlipRevivePointId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp prototype) {
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
     * Protobuf type {@code DungeonSlipRevivePointActivateRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonSlipRevivePointActivateRsp)
        emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.internal_static_DungeonSlipRevivePointActivateRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.internal_static_DungeonSlipRevivePointActivateRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.class, emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.newBuilder()
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
        retcode_ = 0;

        slipRevivePointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.internal_static_DungeonSlipRevivePointActivateRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp build() {
        emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp buildPartial() {
        emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp result = new emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp(this);
        result.retcode_ = retcode_;
        result.slipRevivePointId_ = slipRevivePointId_;
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp other) {
        if (other == emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getSlipRevivePointId() != 0) {
          setSlipRevivePointId(other.getSlipRevivePointId());
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
        emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int slipRevivePointId_ ;
      /**
       * <code>uint32 slip_revive_point_id = 8;</code>
       * @return The slipRevivePointId.
       */
      @java.lang.Override
      public int getSlipRevivePointId() {
        return slipRevivePointId_;
      }
      /**
       * <code>uint32 slip_revive_point_id = 8;</code>
       * @param value The slipRevivePointId to set.
       * @return This builder for chaining.
       */
      public Builder setSlipRevivePointId(int value) {
        
        slipRevivePointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slip_revive_point_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlipRevivePointId() {
        
        slipRevivePointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonSlipRevivePointActivateRsp)
    }

    // @@protoc_insertion_point(class_scope:DungeonSlipRevivePointActivateRsp)
    private static final emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp();
    }

    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonSlipRevivePointActivateRsp>
        PARSER = new com.google.protobuf.AbstractParser<DungeonSlipRevivePointActivateRsp>() {
      @java.lang.Override
      public DungeonSlipRevivePointActivateRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonSlipRevivePointActivateRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonSlipRevivePointActivateRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonSlipRevivePointActivateRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonSlipRevivePointActivateRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonSlipRevivePointActivateRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'DungeonSlipRevivePointActivateRsp.prot" +
      "o\"R\n!DungeonSlipRevivePointActivateRsp\022\017" +
      "\n\007retcode\030\005 \001(\005\022\034\n\024slip_revive_point_id\030" +
      "\010 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonSlipRevivePointActivateRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonSlipRevivePointActivateRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonSlipRevivePointActivateRsp_descriptor,
        new java.lang.String[] { "Retcode", "SlipRevivePointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
