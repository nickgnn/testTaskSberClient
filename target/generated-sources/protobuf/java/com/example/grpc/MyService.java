// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MyService.proto

package com.example.grpc;

public final class MyService {
  private MyService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_MyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_MyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_MyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_MyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017MyService.proto\022\020com.example.grpc\"\034\n\tM" +
      "yRequest\022\017\n\007curName\030\001 \001(\t\"\035\n\nMyResponse\022" +
      "\017\n\007iso4217\030\001 \001(\t2Z\n\017GreetingService\022G\n\ng" +
      "etCurName\022\033.com.example.grpc.MyRequest\032\034" +
      ".com.example.grpc.MyResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_grpc_MyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_MyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_MyRequest_descriptor,
        new java.lang.String[] { "CurName", });
    internal_static_com_example_grpc_MyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_MyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_MyResponse_descriptor,
        new java.lang.String[] { "Iso4217", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
