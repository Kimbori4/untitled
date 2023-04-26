// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ng_tts.proto

package maum.brain.tts.v2;

public interface TtsCustomRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:src.main.proto.TtsCustomRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *Language type
   * </pre>
   *
   * <code>.maum.common.Lang lang = 1;</code>
   */
  int getLangValue();
  /**
   * <pre>
   *Language type
   * </pre>
   *
   * <code>.maum.common.Lang lang = 1;</code>
   */
  maum.common.LangV2.Lang getLang();

  /**
   * <code>int32 sampleRate = 2;</code>
   */
  int getSampleRate();

  /**
   * <code>repeated .src.main.proto.Sentence sentences = 3;</code>
   */
  java.util.List<maum.brain.tts.v2.Sentence> 
      getSentencesList();
  /**
   * <code>repeated .src.main.proto.Sentence sentences = 3;</code>
   */
  maum.brain.tts.v2.Sentence getSentences(int index);
  /**
   * <code>repeated .src.main.proto.Sentence sentences = 3;</code>
   */
  int getSentencesCount();
  /**
   * <code>repeated .src.main.proto.Sentence sentences = 3;</code>
   */
  java.util.List<? extends maum.brain.tts.v2.SentenceOrBuilder> 
      getSentencesOrBuilderList();
  /**
   * <code>repeated .src.main.proto.Sentence sentences = 3;</code>
   */
  maum.brain.tts.v2.SentenceOrBuilder getSentencesOrBuilder(
      int index);

  /**
   * <code>int32 speaker = 4;</code>
   */
  int getSpeaker();

  /**
   * <code>string profile = 5;</code>
   */
  java.lang.String getProfile();
  /**
   * <code>string profile = 5;</code>
   */
  com.google.protobuf.ByteString
      getProfileBytes();

  /**
   * <code>.src.main.proto.AudioEncoding audioEncoding = 6;</code>
   */
  int getAudioEncodingValue();
  /**
   * <code>.src.main.proto.AudioEncoding audioEncoding = 6;</code>
   */
  maum.brain.tts.v2.AudioEncoding getAudioEncoding();

  /**
   * <code>string speakerName = 7;</code>
   */
  java.lang.String getSpeakerName();
  /**
   * <code>string speakerName = 7;</code>
   */
  com.google.protobuf.ByteString
      getSpeakerNameBytes();

  /**
   * <code>.maum.common.Emotion emotion = 8;</code>
   */
  int getEmotionValue();
  /**
   * <code>.maum.common.Emotion emotion = 8;</code>
   */
  maum.common.EmotionOuterClass.Emotion getEmotion();

  /**
   * <code>float durationRate = 9;</code>
   */
  float getDurationRate();

  /**
   * <code>.src.main.proto.Padding padding = 10;</code>
   */
  boolean hasPadding();
  /**
   * <code>.src.main.proto.Padding padding = 10;</code>
   */
  maum.brain.tts.v2.Padding getPadding();
  /**
   * <code>.src.main.proto.Padding padding = 10;</code>
   */
  maum.brain.tts.v2.PaddingOrBuilder getPaddingOrBuilder();
}