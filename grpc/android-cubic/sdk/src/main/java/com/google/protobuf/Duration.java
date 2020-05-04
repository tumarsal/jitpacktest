// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/duration.proto

package com.google.protobuf;

/**
 * <pre>
 * A Duration represents a signed, fixed-length span of time represented
 * as a count of seconds and fractions of seconds at nanosecond
 * resolution. It is independent of any calendar and concepts like "day"
 * or "month". It is related to Timestamp in that the difference between
 * two Timestamp values is a Duration and it can be added or subtracted
 * from a Timestamp. Range is approximately +-10,000 years.
 * # Examples
 * Example 1: Compute Duration from two Timestamps in pseudo code.
 *     Timestamp start = ...;
 *     Timestamp end = ...;
 *     Duration duration = ...;
 *     duration.seconds = end.seconds - start.seconds;
 *     duration.nanos = end.nanos - start.nanos;
 *     if (duration.seconds &lt; 0 &amp;&amp; duration.nanos &gt; 0) {
 *       duration.seconds += 1;
 *       duration.nanos -= 1000000000;
 *     } else if (duration.seconds &gt; 0 &amp;&amp; duration.nanos &lt; 0) {
 *       duration.seconds -= 1;
 *       duration.nanos += 1000000000;
 *     }
 * Example 2: Compute Timestamp from Timestamp + Duration in pseudo code.
 *     Timestamp start = ...;
 *     Duration duration = ...;
 *     Timestamp end = ...;
 *     end.seconds = start.seconds + duration.seconds;
 *     end.nanos = start.nanos + duration.nanos;
 *     if (end.nanos &lt; 0) {
 *       end.seconds -= 1;
 *       end.nanos += 1000000000;
 *     } else if (end.nanos &gt;= 1000000000) {
 *       end.seconds += 1;
 *       end.nanos -= 1000000000;
 *     }
 * Example 3: Compute Duration from datetime.timedelta in Python.
 *     td = datetime.timedelta(days=3, minutes=10)
 *     duration = Duration()
 *     duration.FromTimedelta(td)
 * # JSON Mapping
 * In JSON format, the Duration type is encoded as a string rather than an
 * object, where the string ends in the suffix "s" (indicating seconds) and
 * is preceded by the number of seconds, with nanoseconds expressed as
 * fractional seconds. For example, 3 seconds with 0 nanoseconds should be
 * encoded in JSON format as "3s", while 3 seconds and 1 nanosecond should
 * be expressed in JSON format as "3.000000001s", and 3 seconds and 1
 * microsecond should be expressed in JSON format as "3.000001s".
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Duration}
 */
public  final class Duration extends
    com.google.protobuf.GeneratedMessageLite<
        Duration, Duration.Builder> implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Duration)
    DurationOrBuilder {
  private Duration() {
  }
  public static final int SECONDS_FIELD_NUMBER = 1;
  private long seconds_;
  /**
   * <pre>
   * Signed seconds of the span of time. Must be from -315,576,000,000
   * to +315,576,000,000 inclusive. Note: these bounds are computed from:
   * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
   * </pre>
   *
   * <code>optional int64 seconds = 1;</code>
   */
  public long getSeconds() {
    return seconds_;
  }
  /**
   * <pre>
   * Signed seconds of the span of time. Must be from -315,576,000,000
   * to +315,576,000,000 inclusive. Note: these bounds are computed from:
   * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
   * </pre>
   *
   * <code>optional int64 seconds = 1;</code>
   */
  private void setSeconds(long value) {
    
    seconds_ = value;
  }
  /**
   * <pre>
   * Signed seconds of the span of time. Must be from -315,576,000,000
   * to +315,576,000,000 inclusive. Note: these bounds are computed from:
   * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
   * </pre>
   *
   * <code>optional int64 seconds = 1;</code>
   */
  private void clearSeconds() {
    
    seconds_ = 0L;
  }

  public static final int NANOS_FIELD_NUMBER = 2;
  private int nanos_;
  /**
   * <pre>
   * Signed fractions of a second at nanosecond resolution of the span
   * of time. Durations less than one second are represented with a 0
   * `seconds` field and a positive or negative `nanos` field. For durations
   * of one second or more, a non-zero value for the `nanos` field must be
   * of the same sign as the `seconds` field. Must be from -999,999,999
   * to +999,999,999 inclusive.
   * </pre>
   *
   * <code>optional int32 nanos = 2;</code>
   */
  public int getNanos() {
    return nanos_;
  }
  /**
   * <pre>
   * Signed fractions of a second at nanosecond resolution of the span
   * of time. Durations less than one second are represented with a 0
   * `seconds` field and a positive or negative `nanos` field. For durations
   * of one second or more, a non-zero value for the `nanos` field must be
   * of the same sign as the `seconds` field. Must be from -999,999,999
   * to +999,999,999 inclusive.
   * </pre>
   *
   * <code>optional int32 nanos = 2;</code>
   */
  private void setNanos(int value) {
    
    nanos_ = value;
  }
  /**
   * <pre>
   * Signed fractions of a second at nanosecond resolution of the span
   * of time. Durations less than one second are represented with a 0
   * `seconds` field and a positive or negative `nanos` field. For durations
   * of one second or more, a non-zero value for the `nanos` field must be
   * of the same sign as the `seconds` field. Must be from -999,999,999
   * to +999,999,999 inclusive.
   * </pre>
   *
   * <code>optional int32 nanos = 2;</code>
   */
  private void clearNanos() {
    
    nanos_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (seconds_ != 0L) {
      output.writeInt64(1, seconds_);
    }
    if (nanos_ != 0) {
      output.writeInt32(2, nanos_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (seconds_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, seconds_);
    }
    if (nanos_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, nanos_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.protobuf.Duration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Duration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Duration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Duration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Duration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Duration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Duration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Duration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Duration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Duration parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.Duration prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * A Duration represents a signed, fixed-length span of time represented
   * as a count of seconds and fractions of seconds at nanosecond
   * resolution. It is independent of any calendar and concepts like "day"
   * or "month". It is related to Timestamp in that the difference between
   * two Timestamp values is a Duration and it can be added or subtracted
   * from a Timestamp. Range is approximately +-10,000 years.
   * # Examples
   * Example 1: Compute Duration from two Timestamps in pseudo code.
   *     Timestamp start = ...;
   *     Timestamp end = ...;
   *     Duration duration = ...;
   *     duration.seconds = end.seconds - start.seconds;
   *     duration.nanos = end.nanos - start.nanos;
   *     if (duration.seconds &lt; 0 &amp;&amp; duration.nanos &gt; 0) {
   *       duration.seconds += 1;
   *       duration.nanos -= 1000000000;
   *     } else if (duration.seconds &gt; 0 &amp;&amp; duration.nanos &lt; 0) {
   *       duration.seconds -= 1;
   *       duration.nanos += 1000000000;
   *     }
   * Example 2: Compute Timestamp from Timestamp + Duration in pseudo code.
   *     Timestamp start = ...;
   *     Duration duration = ...;
   *     Timestamp end = ...;
   *     end.seconds = start.seconds + duration.seconds;
   *     end.nanos = start.nanos + duration.nanos;
   *     if (end.nanos &lt; 0) {
   *       end.seconds -= 1;
   *       end.nanos += 1000000000;
   *     } else if (end.nanos &gt;= 1000000000) {
   *       end.seconds += 1;
   *       end.nanos -= 1000000000;
   *     }
   * Example 3: Compute Duration from datetime.timedelta in Python.
   *     td = datetime.timedelta(days=3, minutes=10)
   *     duration = Duration()
   *     duration.FromTimedelta(td)
   * # JSON Mapping
   * In JSON format, the Duration type is encoded as a string rather than an
   * object, where the string ends in the suffix "s" (indicating seconds) and
   * is preceded by the number of seconds, with nanoseconds expressed as
   * fractional seconds. For example, 3 seconds with 0 nanoseconds should be
   * encoded in JSON format as "3s", while 3 seconds and 1 nanosecond should
   * be expressed in JSON format as "3.000000001s", and 3 seconds and 1
   * microsecond should be expressed in JSON format as "3.000001s".
   * </pre>
   *
   * Protobuf type {@code google.protobuf.Duration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.protobuf.Duration, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Duration)
      com.google.protobuf.DurationOrBuilder {
    // Construct using com.google.protobuf.Duration.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Signed seconds of the span of time. Must be from -315,576,000,000
     * to +315,576,000,000 inclusive. Note: these bounds are computed from:
     * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * </pre>
     *
     * <code>optional int64 seconds = 1;</code>
     */
    public long getSeconds() {
      return instance.getSeconds();
    }
    /**
     * <pre>
     * Signed seconds of the span of time. Must be from -315,576,000,000
     * to +315,576,000,000 inclusive. Note: these bounds are computed from:
     * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * </pre>
     *
     * <code>optional int64 seconds = 1;</code>
     */
    public Builder setSeconds(long value) {
      copyOnWrite();
      instance.setSeconds(value);
      return this;
    }
    /**
     * <pre>
     * Signed seconds of the span of time. Must be from -315,576,000,000
     * to +315,576,000,000 inclusive. Note: these bounds are computed from:
     * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * </pre>
     *
     * <code>optional int64 seconds = 1;</code>
     */
    public Builder clearSeconds() {
      copyOnWrite();
      instance.clearSeconds();
      return this;
    }

    /**
     * <pre>
     * Signed fractions of a second at nanosecond resolution of the span
     * of time. Durations less than one second are represented with a 0
     * `seconds` field and a positive or negative `nanos` field. For durations
     * of one second or more, a non-zero value for the `nanos` field must be
     * of the same sign as the `seconds` field. Must be from -999,999,999
     * to +999,999,999 inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 2;</code>
     */
    public int getNanos() {
      return instance.getNanos();
    }
    /**
     * <pre>
     * Signed fractions of a second at nanosecond resolution of the span
     * of time. Durations less than one second are represented with a 0
     * `seconds` field and a positive or negative `nanos` field. For durations
     * of one second or more, a non-zero value for the `nanos` field must be
     * of the same sign as the `seconds` field. Must be from -999,999,999
     * to +999,999,999 inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 2;</code>
     */
    public Builder setNanos(int value) {
      copyOnWrite();
      instance.setNanos(value);
      return this;
    }
    /**
     * <pre>
     * Signed fractions of a second at nanosecond resolution of the span
     * of time. Durations less than one second are represented with a 0
     * `seconds` field and a positive or negative `nanos` field. For durations
     * of one second or more, a non-zero value for the `nanos` field must be
     * of the same sign as the `seconds` field. Must be from -999,999,999
     * to +999,999,999 inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 2;</code>
     */
    public Builder clearNanos() {
      copyOnWrite();
      instance.clearNanos();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.Duration)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.protobuf.Duration();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.protobuf.Duration other = (com.google.protobuf.Duration) arg1;
        seconds_ = visitor.visitLong(seconds_ != 0L, seconds_,
            other.seconds_ != 0L, other.seconds_);
        nanos_ = visitor.visitInt(nanos_ != 0, nanos_,
            other.nanos_ != 0, other.nanos_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 8: {

                seconds_ = input.readInt64();
                break;
              }
              case 16: {

                nanos_ = input.readInt32();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.google.protobuf.Duration.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.protobuf.Duration)
  private static final com.google.protobuf.Duration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Duration();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.protobuf.Duration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Duration> PARSER;

  public static com.google.protobuf.Parser<Duration> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

