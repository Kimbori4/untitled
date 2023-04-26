package maum.brain.tts.v2;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: ng_tts.proto")
public final class NgTtsServiceGrpc {

  private NgTtsServiceGrpc() {}

  public static final String SERVICE_NAME = "src.main.proto.NgTtsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<maum.brain.tts.v2.PreprocessingRequest,
      maum.brain.tts.v2.PreprocessingResponse> METHOD_PREPROCESS =
      io.grpc.MethodDescriptor.<maum.brain.tts.v2.PreprocessingRequest, maum.brain.tts.v2.PreprocessingResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "src.main.proto.NgTtsService", "Preprocess"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              maum.brain.tts.v2.PreprocessingRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              maum.brain.tts.v2.PreprocessingResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<maum.brain.tts.v2.TtsRequest,
      maum.brain.tts.v2.TtsMediaResponse> METHOD_SPEAK_WAV =
      io.grpc.MethodDescriptor.<maum.brain.tts.v2.TtsRequest, maum.brain.tts.v2.TtsMediaResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "src.main.proto.NgTtsService", "SpeakWav"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              maum.brain.tts.v2.TtsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              maum.brain.tts.v2.TtsMediaResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<maum.brain.tts.v2.TtsCustomRequest,
      maum.brain.tts.v2.TtsMediaResponse> METHOD_SPEAK_WAV_CUSTOM =
      io.grpc.MethodDescriptor.<maum.brain.tts.v2.TtsCustomRequest, maum.brain.tts.v2.TtsMediaResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "src.main.proto.NgTtsService", "SpeakWavCustom"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              maum.brain.tts.v2.TtsCustomRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              maum.brain.tts.v2.TtsMediaResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NgTtsServiceStub newStub(io.grpc.Channel channel) {
    return new NgTtsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NgTtsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NgTtsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NgTtsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NgTtsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NgTtsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void preprocess(maum.brain.tts.v2.PreprocessingRequest request,
        io.grpc.stub.StreamObserver<maum.brain.tts.v2.PreprocessingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PREPROCESS, responseObserver);
    }

    /**
     */
    public void speakWav(maum.brain.tts.v2.TtsRequest request,
        io.grpc.stub.StreamObserver<maum.brain.tts.v2.TtsMediaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SPEAK_WAV, responseObserver);
    }

    /**
     */
    public void speakWavCustom(maum.brain.tts.v2.TtsCustomRequest request,
        io.grpc.stub.StreamObserver<maum.brain.tts.v2.TtsMediaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SPEAK_WAV_CUSTOM, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PREPROCESS,
            asyncUnaryCall(
              new MethodHandlers<
                maum.brain.tts.v2.PreprocessingRequest,
                maum.brain.tts.v2.PreprocessingResponse>(
                  this, METHODID_PREPROCESS)))
          .addMethod(
            METHOD_SPEAK_WAV,
            asyncServerStreamingCall(
              new MethodHandlers<
                maum.brain.tts.v2.TtsRequest,
                maum.brain.tts.v2.TtsMediaResponse>(
                  this, METHODID_SPEAK_WAV)))
          .addMethod(
            METHOD_SPEAK_WAV_CUSTOM,
            asyncServerStreamingCall(
              new MethodHandlers<
                maum.brain.tts.v2.TtsCustomRequest,
                maum.brain.tts.v2.TtsMediaResponse>(
                  this, METHODID_SPEAK_WAV_CUSTOM)))
          .build();
    }
  }

  /**
   */
  public static final class NgTtsServiceStub extends io.grpc.stub.AbstractStub<NgTtsServiceStub> {
    private NgTtsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NgTtsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NgTtsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NgTtsServiceStub(channel, callOptions);
    }

    /**
     */
    public void preprocess(maum.brain.tts.v2.PreprocessingRequest request,
        io.grpc.stub.StreamObserver<maum.brain.tts.v2.PreprocessingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PREPROCESS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void speakWav(maum.brain.tts.v2.TtsRequest request,
        io.grpc.stub.StreamObserver<maum.brain.tts.v2.TtsMediaResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SPEAK_WAV, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void speakWavCustom(maum.brain.tts.v2.TtsCustomRequest request,
        io.grpc.stub.StreamObserver<maum.brain.tts.v2.TtsMediaResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SPEAK_WAV_CUSTOM, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NgTtsServiceBlockingStub extends io.grpc.stub.AbstractStub<NgTtsServiceBlockingStub> {
    private NgTtsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NgTtsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NgTtsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NgTtsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public maum.brain.tts.v2.PreprocessingResponse preprocess(maum.brain.tts.v2.PreprocessingRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PREPROCESS, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<maum.brain.tts.v2.TtsMediaResponse> speakWav(
        maum.brain.tts.v2.TtsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SPEAK_WAV, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<maum.brain.tts.v2.TtsMediaResponse> speakWavCustom(
        maum.brain.tts.v2.TtsCustomRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SPEAK_WAV_CUSTOM, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NgTtsServiceFutureStub extends io.grpc.stub.AbstractStub<NgTtsServiceFutureStub> {
    private NgTtsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NgTtsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NgTtsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NgTtsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<maum.brain.tts.v2.PreprocessingResponse> preprocess(
        maum.brain.tts.v2.PreprocessingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PREPROCESS, getCallOptions()), request);
    }
  }

  private static final int METHODID_PREPROCESS = 0;
  private static final int METHODID_SPEAK_WAV = 1;
  private static final int METHODID_SPEAK_WAV_CUSTOM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NgTtsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NgTtsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PREPROCESS:
          serviceImpl.preprocess((maum.brain.tts.v2.PreprocessingRequest) request,
              (io.grpc.stub.StreamObserver<maum.brain.tts.v2.PreprocessingResponse>) responseObserver);
          break;
        case METHODID_SPEAK_WAV:
          serviceImpl.speakWav((maum.brain.tts.v2.TtsRequest) request,
              (io.grpc.stub.StreamObserver<maum.brain.tts.v2.TtsMediaResponse>) responseObserver);
          break;
        case METHODID_SPEAK_WAV_CUSTOM:
          serviceImpl.speakWavCustom((maum.brain.tts.v2.TtsCustomRequest) request,
              (io.grpc.stub.StreamObserver<maum.brain.tts.v2.TtsMediaResponse>) responseObserver);
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

  private static final class NgTtsServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return maum.brain.tts.v2.BrainNgTtsService.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NgTtsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NgTtsServiceDescriptorSupplier())
              .addMethod(METHOD_PREPROCESS)
              .addMethod(METHOD_SPEAK_WAV)
              .addMethod(METHOD_SPEAK_WAV_CUSTOM)
              .build();
        }
      }
    }
    return result;
  }
}
