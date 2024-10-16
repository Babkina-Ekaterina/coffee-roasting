package backend.test.coffee_roasting.grpc.roasting_outtake;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: roasting_outtake.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RoastingServiceGrpc {

  private RoastingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "RoastingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<RoastingOuttakeRequest,
          RoastingOuttakeResponse> getAddRoastingOuttakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRoastingOuttake",
      requestType = RoastingOuttakeRequest.class,
      responseType = RoastingOuttakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<RoastingOuttakeRequest,
          RoastingOuttakeResponse> getAddRoastingOuttakeMethod() {
    io.grpc.MethodDescriptor<RoastingOuttakeRequest, RoastingOuttakeResponse> getAddRoastingOuttakeMethod;
    if ((getAddRoastingOuttakeMethod = RoastingServiceGrpc.getAddRoastingOuttakeMethod) == null) {
      synchronized (RoastingServiceGrpc.class) {
        if ((getAddRoastingOuttakeMethod = RoastingServiceGrpc.getAddRoastingOuttakeMethod) == null) {
          RoastingServiceGrpc.getAddRoastingOuttakeMethod = getAddRoastingOuttakeMethod =
              io.grpc.MethodDescriptor.<RoastingOuttakeRequest, RoastingOuttakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRoastingOuttake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RoastingOuttakeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RoastingOuttakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoastingServiceMethodDescriptorSupplier("AddRoastingOuttake"))
              .build();
        }
      }
    }
    return getAddRoastingOuttakeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoastingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoastingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoastingServiceStub>() {
        @java.lang.Override
        public RoastingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoastingServiceStub(channel, callOptions);
        }
      };
    return RoastingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoastingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoastingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoastingServiceBlockingStub>() {
        @java.lang.Override
        public RoastingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoastingServiceBlockingStub(channel, callOptions);
        }
      };
    return RoastingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoastingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoastingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoastingServiceFutureStub>() {
        @java.lang.Override
        public RoastingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoastingServiceFutureStub(channel, callOptions);
        }
      };
    return RoastingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addRoastingOuttake(RoastingOuttakeRequest request,
                                    io.grpc.stub.StreamObserver<RoastingOuttakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRoastingOuttakeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RoastingService.
   */
  public static abstract class RoastingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RoastingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RoastingService.
   */
  public static final class RoastingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RoastingServiceStub> {
    private RoastingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoastingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoastingServiceStub(channel, callOptions);
    }

    /**
     */
    public void addRoastingOuttake(RoastingOuttakeRequest request,
                                   io.grpc.stub.StreamObserver<RoastingOuttakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRoastingOuttakeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RoastingService.
   */
  public static final class RoastingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RoastingServiceBlockingStub> {
    private RoastingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoastingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoastingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public RoastingOuttakeResponse addRoastingOuttake(RoastingOuttakeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRoastingOuttakeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RoastingService.
   */
  public static final class RoastingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RoastingServiceFutureStub> {
    private RoastingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoastingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoastingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<RoastingOuttakeResponse> addRoastingOuttake(
        RoastingOuttakeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRoastingOuttakeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ROASTING_OUTTAKE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ROASTING_OUTTAKE:
          serviceImpl.addRoastingOuttake((RoastingOuttakeRequest) request,
              (io.grpc.stub.StreamObserver<RoastingOuttakeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddRoastingOuttakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
                    RoastingOuttakeRequest,
                    RoastingOuttakeResponse>(
                service, METHODID_ADD_ROASTING_OUTTAKE)))
        .build();
  }

  private static abstract class RoastingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoastingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return RoastingOuttakeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoastingService");
    }
  }

  private static final class RoastingServiceFileDescriptorSupplier
      extends RoastingServiceBaseDescriptorSupplier {
    RoastingServiceFileDescriptorSupplier() {}
  }

  private static final class RoastingServiceMethodDescriptorSupplier
      extends RoastingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RoastingServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RoastingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoastingServiceFileDescriptorSupplier())
              .addMethod(getAddRoastingOuttakeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
