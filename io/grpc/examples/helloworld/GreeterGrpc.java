package io.grpc.examples.helloworld;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: helloworld.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> METHOD_SAY_HELLO = getSayHelloMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayHelloMethod() {
    return getSayHelloMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayHelloMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest, io.grpc.examples.helloworld.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.HelloRequest, io.grpc.examples.helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHiMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> METHOD_SAY_HI = getSayHiMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayHiMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayHiMethod() {
    return getSayHiMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayHiMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest, io.grpc.examples.helloworld.HelloReply> getSayHiMethod;
    if ((getSayHiMethod = GreeterGrpc.getSayHiMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHiMethod = GreeterGrpc.getSayHiMethod) == null) {
          GreeterGrpc.getSayHiMethod = getSayHiMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.HelloRequest, io.grpc.examples.helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "SayHi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHi"))
                  .build();
          }
        }
     }
     return getSayHiMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayBalaMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> METHOD_SAY_BALA = getSayBalaMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayBalaMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayBalaMethod() {
    return getSayBalaMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayBalaMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest, io.grpc.examples.helloworld.HelloReply> getSayBalaMethod;
    if ((getSayBalaMethod = GreeterGrpc.getSayBalaMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayBalaMethod = GreeterGrpc.getSayBalaMethod) == null) {
          GreeterGrpc.getSayBalaMethod = getSayBalaMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.HelloRequest, io.grpc.examples.helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "SayBala"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayBala"))
                  .build();
          }
        }
     }
     return getSayBalaMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDiscussMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> METHOD_DISCUSS = getDiscussMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getDiscussMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getDiscussMethod() {
    return getDiscussMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getDiscussMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest, io.grpc.examples.helloworld.HelloReply> getDiscussMethod;
    if ((getDiscussMethod = GreeterGrpc.getDiscussMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getDiscussMethod = GreeterGrpc.getDiscussMethod) == null) {
          GreeterGrpc.getDiscussMethod = getDiscussMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.HelloRequest, io.grpc.examples.helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "Discuss"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("Discuss"))
                  .build();
          }
        }
     }
     return getDiscussMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void sayHello(io.grpc.examples.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * server streaming
     * </pre>
     */
    public void sayHi(io.grpc.examples.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHiMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloRequest> sayBala(
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getSayBalaMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloRequest> discuss(
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getDiscussMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.HelloRequest,
                io.grpc.examples.helloworld.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHiMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.HelloRequest,
                io.grpc.examples.helloworld.HelloReply>(
                  this, METHODID_SAY_HI)))
          .addMethod(
            getSayBalaMethodHelper(),
            asyncClientStreamingCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.HelloRequest,
                io.grpc.examples.helloworld.HelloReply>(
                  this, METHODID_SAY_BALA)))
          .addMethod(
            getDiscussMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.HelloRequest,
                io.grpc.examples.helloworld.HelloReply>(
                  this, METHODID_DISCUSS)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void sayHello(io.grpc.examples.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * server streaming
     * </pre>
     */
    public void sayHi(io.grpc.examples.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSayHiMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloRequest> sayBala(
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSayBalaMethodHelper(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloRequest> discuss(
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getDiscussMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public io.grpc.examples.helloworld.HelloReply sayHello(io.grpc.examples.helloworld.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * server streaming
     * </pre>
     */
    public java.util.Iterator<io.grpc.examples.helloworld.HelloReply> sayHi(
        io.grpc.examples.helloworld.HelloRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSayHiMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.HelloReply> sayHello(
        io.grpc.examples.helloworld.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HI = 1;
  private static final int METHODID_SAY_BALA = 2;
  private static final int METHODID_DISCUSS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((io.grpc.examples.helloworld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_HI:
          serviceImpl.sayHi((io.grpc.examples.helloworld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply>) responseObserver);
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
        case METHODID_SAY_BALA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayBala(
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply>) responseObserver);
        case METHODID_DISCUSS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.discuss(
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.helloworld.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethodHelper())
              .addMethod(getSayHiMethodHelper())
              .addMethod(getSayBalaMethodHelper())
              .addMethod(getDiscussMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
