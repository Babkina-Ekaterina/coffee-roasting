// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: roasting_outtake.proto

package backend.test.coffee_roasting.grpc.roasting_outtake;

public final class RoastingOuttakeProto {
  private RoastingOuttakeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoastingOuttakeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoastingOuttakeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoastingOuttakeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoastingOuttakeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026roasting_outtake.proto\"\221\001\n\026RoastingOut" +
      "takeRequest\022\022\n\ngrain_type\030\001 \001(\t\022\026\n\016origi" +
      "n_country\030\002 \001(\t\022\032\n\022input_weight_grams\030\003 " +
      "\001(\001\022\033\n\023output_weight_grams\030\004 \001(\001\022\022\n\nbrig" +
      "ade_id\030\005 \001(\t\"*\n\027RoastingOuttakeResponse\022" +
      "\017\n\007message\030\001 \001(\t2Z\n\017RoastingService\022G\n\022A" +
      "ddRoastingOuttake\022\027.RoastingOuttakeReque" +
      "st\032\030.RoastingOuttakeResponseB;\n!backend." +
      "test.coffee_roasting.grpcB\024RoastingOutta" +
      "keProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoastingOuttakeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoastingOuttakeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoastingOuttakeRequest_descriptor,
        new java.lang.String[] { "GrainType", "OriginCountry", "InputWeightGrams", "OutputWeightGrams", "BrigadeId", });
    internal_static_RoastingOuttakeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RoastingOuttakeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoastingOuttakeResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
