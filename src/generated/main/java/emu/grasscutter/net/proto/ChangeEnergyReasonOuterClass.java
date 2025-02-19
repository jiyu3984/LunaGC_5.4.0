// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeEnergyReason.proto

package emu.grasscutter.net.proto;

public final class ChangeEnergyReasonOuterClass {
  private ChangeEnergyReasonOuterClass() {}
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
   *obf: DIBAILDCPJF
   * </pre>
   *
   * Protobuf enum {@code ChangeEnergyReason}
   */
  public enum ChangeEnergyReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CHANGE_ENERGY_REASON_NONE = 0;</code>
     */
    CHANGE_ENERGY_REASON_NONE(0),
    /**
     * <code>CHANGE_ENERGY_REASON_SKILL_START = 1;</code>
     */
    CHANGE_ENERGY_REASON_SKILL_START(1),
    /**
     * <code>CHANGE_CHANGE_ENERGY_BALL = 2;</code>
     */
    CHANGE_CHANGE_ENERGY_BALL(2),
    /**
     * <code>CHANGE_CHANGE_ENERGY_QUEST = 3;</code>
     */
    CHANGE_CHANGE_ENERGY_QUEST(3),
    /**
     * <code>CHANGE_CHANGE_ENERGY_ABILITY = 4;</code>
     */
    CHANGE_CHANGE_ENERGY_ABILITY(4),
    /**
     * <code>CHANGE_CHANGE_ENERGY_DIE = 5;</code>
     */
    CHANGE_CHANGE_ENERGY_DIE(5),
    /**
     * <code>CHANGE_CHANGE_ENERGY_SKILL_DEPOT = 6;</code>
     */
    CHANGE_CHANGE_ENERGY_SKILL_DEPOT(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CHANGE_ENERGY_REASON_NONE = 0;</code>
     */
    public static final int CHANGE_ENERGY_REASON_NONE_VALUE = 0;
    /**
     * <code>CHANGE_ENERGY_REASON_SKILL_START = 1;</code>
     */
    public static final int CHANGE_ENERGY_REASON_SKILL_START_VALUE = 1;
    /**
     * <code>CHANGE_CHANGE_ENERGY_BALL = 2;</code>
     */
    public static final int CHANGE_CHANGE_ENERGY_BALL_VALUE = 2;
    /**
     * <code>CHANGE_CHANGE_ENERGY_QUEST = 3;</code>
     */
    public static final int CHANGE_CHANGE_ENERGY_QUEST_VALUE = 3;
    /**
     * <code>CHANGE_CHANGE_ENERGY_ABILITY = 4;</code>
     */
    public static final int CHANGE_CHANGE_ENERGY_ABILITY_VALUE = 4;
    /**
     * <code>CHANGE_CHANGE_ENERGY_DIE = 5;</code>
     */
    public static final int CHANGE_CHANGE_ENERGY_DIE_VALUE = 5;
    /**
     * <code>CHANGE_CHANGE_ENERGY_SKILL_DEPOT = 6;</code>
     */
    public static final int CHANGE_CHANGE_ENERGY_SKILL_DEPOT_VALUE = 6;


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
    public static ChangeEnergyReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ChangeEnergyReason forNumber(int value) {
      switch (value) {
        case 0: return CHANGE_ENERGY_REASON_NONE;
        case 1: return CHANGE_ENERGY_REASON_SKILL_START;
        case 2: return CHANGE_CHANGE_ENERGY_BALL;
        case 3: return CHANGE_CHANGE_ENERGY_QUEST;
        case 4: return CHANGE_CHANGE_ENERGY_ABILITY;
        case 5: return CHANGE_CHANGE_ENERGY_DIE;
        case 6: return CHANGE_CHANGE_ENERGY_SKILL_DEPOT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChangeEnergyReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ChangeEnergyReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChangeEnergyReason>() {
            public ChangeEnergyReason findValueByNumber(int number) {
              return ChangeEnergyReason.forNumber(number);
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
      return emu.grasscutter.net.proto.ChangeEnergyReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ChangeEnergyReason[] VALUES = values();

    public static ChangeEnergyReason valueOf(
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

    private ChangeEnergyReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ChangeEnergyReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ChangeEnergyReason.proto*\376\001\n\022ChangeEne" +
      "rgyReason\022\035\n\031CHANGE_ENERGY_REASON_NONE\020\000" +
      "\022$\n CHANGE_ENERGY_REASON_SKILL_START\020\001\022\035" +
      "\n\031CHANGE_CHANGE_ENERGY_BALL\020\002\022\036\n\032CHANGE_" +
      "CHANGE_ENERGY_QUEST\020\003\022 \n\034CHANGE_CHANGE_E" +
      "NERGY_ABILITY\020\004\022\034\n\030CHANGE_CHANGE_ENERGY_" +
      "DIE\020\005\022$\n CHANGE_CHANGE_ENERGY_SKILL_DEPO" +
      "T\020\006B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
