// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HitColliderType.proto

package emu.grasscutter.net.proto;

public final class HitColliderTypeOuterClass {
  private HitColliderTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   *obf: LPNDGGEHLED
   * </pre>
   *
   * Protobuf enum {@code HitColliderType}
   */
  public enum HitColliderType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>HIT_COLLIDER_TYPE_INVALID = 0;</code>
     */
    HIT_COLLIDER_TYPE_INVALID(0),
    /**
     * <code>HIT_COLLIDER_TYPE_HIT_BOX = 1;</code>
     */
    HIT_COLLIDER_TYPE_HIT_BOX(1),
    /**
     * <code>HIT_COLLIDER_TYPE_WET_HIT_BOX = 2;</code>
     */
    HIT_COLLIDER_TYPE_WET_HIT_BOX(2),
    /**
     * <code>HIT_COLLIDER_TYPE_HEAD_BOX = 3;</code>
     */
    HIT_COLLIDER_TYPE_HEAD_BOX(3),
    /**
     * <code>HIT_COLLIDER_INVALID = 4;</code>
     */
    HIT_COLLIDER_INVALID(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>HIT_COLLIDER_TYPE_INVALID = 0;</code>
     */
    public static final int HIT_COLLIDER_TYPE_INVALID_VALUE = 0;
    /**
     * <code>HIT_COLLIDER_TYPE_HIT_BOX = 1;</code>
     */
    public static final int HIT_COLLIDER_TYPE_HIT_BOX_VALUE = 1;
    /**
     * <code>HIT_COLLIDER_TYPE_WET_HIT_BOX = 2;</code>
     */
    public static final int HIT_COLLIDER_TYPE_WET_HIT_BOX_VALUE = 2;
    /**
     * <code>HIT_COLLIDER_TYPE_HEAD_BOX = 3;</code>
     */
    public static final int HIT_COLLIDER_TYPE_HEAD_BOX_VALUE = 3;
    /**
     * <code>HIT_COLLIDER_INVALID = 4;</code>
     */
    public static final int HIT_COLLIDER_INVALID_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static HitColliderType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HitColliderType forNumber(int value) {
      switch (value) {
        case 0: return HIT_COLLIDER_TYPE_INVALID;
        case 1: return HIT_COLLIDER_TYPE_HIT_BOX;
        case 2: return HIT_COLLIDER_TYPE_WET_HIT_BOX;
        case 3: return HIT_COLLIDER_TYPE_HEAD_BOX;
        case 4: return HIT_COLLIDER_INVALID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HitColliderType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HitColliderType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HitColliderType>() {
            public HitColliderType findValueByNumber(int number) {
              return HitColliderType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HitColliderTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final HitColliderType[] VALUES = values();

    public static HitColliderType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private HitColliderType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:HitColliderType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025HitColliderType.proto*\254\001\n\017HitColliderT" +
      "ype\022\035\n\031HIT_COLLIDER_TYPE_INVALID\020\000\022\035\n\031HI" +
      "T_COLLIDER_TYPE_HIT_BOX\020\001\022!\n\035HIT_COLLIDE" +
      "R_TYPE_WET_HIT_BOX\020\002\022\036\n\032HIT_COLLIDER_TYP" +
      "E_HEAD_BOX\020\003\022\030\n\024HIT_COLLIDER_INVALID\020\004B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
