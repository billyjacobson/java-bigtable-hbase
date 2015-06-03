// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/table/v1approved/bigtable_table_service_messages.proto

package com.google.bigtable.admin.table.v1;

/**
 * Protobuf type {@code google.bigtable.admin.table.v1.CreateColumnFamilyRequest}
 */
public  final class CreateColumnFamilyRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.table.v1.CreateColumnFamilyRequest)
    CreateColumnFamilyRequestOrBuilder {
  // Use CreateColumnFamilyRequest.newBuilder() to construct.
  private CreateColumnFamilyRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private CreateColumnFamilyRequest() {
    name_ = "";
    columnFamilyId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateColumnFamilyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();

            name_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();

            columnFamilyId_ = bs;
            break;
          }
          case 26: {
            com.google.bigtable.admin.table.v1.ColumnFamily.Builder subBuilder = null;
            if (columnFamily_ != null) {
              subBuilder = columnFamily_.toBuilder();
            }
            columnFamily_ = input.readMessage(com.google.bigtable.admin.table.v1.ColumnFamily.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(columnFamily_);
              columnFamily_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.admin.table.v1.BigtableTableServiceMessagesProto.internal_static_google_bigtable_admin_table_v1_CreateColumnFamilyRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.table.v1.BigtableTableServiceMessagesProto.internal_static_google_bigtable_admin_table_v1_CreateColumnFamilyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest.class, com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest.Builder.class);
  }

  public static final com.google.protobuf.Parser<CreateColumnFamilyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateColumnFamilyRequest>() {
    public CreateColumnFamilyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateColumnFamilyRequest(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<CreateColumnFamilyRequest> getParserForType() {
    return PARSER;
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.Object name_;
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * The unique name of the table in which to create the new column family.
   * </pre>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * The unique name of the table in which to create the new column family.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLUMN_FAMILY_ID_FIELD_NUMBER = 2;
  private java.lang.Object columnFamilyId_;
  /**
   * <code>optional string column_family_id = 2;</code>
   *
   * <pre>
   * The name by which the new column family should be referred to within the
   * table, e.g. "foobar" rather than "&lt;table_name&gt;/columnFamilies/foobar".
   * </pre>
   */
  public java.lang.String getColumnFamilyId() {
    java.lang.Object ref = columnFamilyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        columnFamilyId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string column_family_id = 2;</code>
   *
   * <pre>
   * The name by which the new column family should be referred to within the
   * table, e.g. "foobar" rather than "&lt;table_name&gt;/columnFamilies/foobar".
   * </pre>
   */
  public com.google.protobuf.ByteString
      getColumnFamilyIdBytes() {
    java.lang.Object ref = columnFamilyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      columnFamilyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLUMN_FAMILY_FIELD_NUMBER = 3;
  private com.google.bigtable.admin.table.v1.ColumnFamily columnFamily_;
  /**
   * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
   *
   * <pre>
   * The column family to create. The `name` field must be left blank.
   * </pre>
   */
  public boolean hasColumnFamily() {
    return columnFamily_ != null;
  }
  /**
   * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
   *
   * <pre>
   * The column family to create. The `name` field must be left blank.
   * </pre>
   */
  public com.google.bigtable.admin.table.v1.ColumnFamily getColumnFamily() {
    return columnFamily_ == null ? com.google.bigtable.admin.table.v1.ColumnFamily.getDefaultInstance() : columnFamily_;
  }
  /**
   * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
   *
   * <pre>
   * The column family to create. The `name` field must be left blank.
   * </pre>
   */
  public com.google.bigtable.admin.table.v1.ColumnFamilyOrBuilder getColumnFamilyOrBuilder() {
    return getColumnFamily();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (!getNameBytes().isEmpty()) {
      output.writeBytes(1, getNameBytes());
    }
    if (!getColumnFamilyIdBytes().isEmpty()) {
      output.writeBytes(2, getColumnFamilyIdBytes());
    }
    if (columnFamily_ != null) {
      output.writeMessage(3, getColumnFamily());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getNameBytes());
    }
    if (!getColumnFamilyIdBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getColumnFamilyIdBytes());
    }
    if (columnFamily_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getColumnFamily());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.bigtable.admin.table.v1.CreateColumnFamilyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.table.v1.CreateColumnFamilyRequest)
      com.google.bigtable.admin.table.v1.CreateColumnFamilyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.table.v1.BigtableTableServiceMessagesProto.internal_static_google_bigtable_admin_table_v1_CreateColumnFamilyRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.table.v1.BigtableTableServiceMessagesProto.internal_static_google_bigtable_admin_table_v1_CreateColumnFamilyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest.class, com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest.Builder.class);
    }

    // Construct using com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      columnFamilyId_ = "";

      if (columnFamilyBuilder_ == null) {
        columnFamily_ = null;
      } else {
        columnFamily_ = null;
        columnFamilyBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.table.v1.BigtableTableServiceMessagesProto.internal_static_google_bigtable_admin_table_v1_CreateColumnFamilyRequest_descriptor;
    }

    public com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest getDefaultInstanceForType() {
      return com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest.getDefaultInstance();
    }

    public com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest build() {
      com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest buildPartial() {
      com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest result = new com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest(this);
      result.name_ = name_;
      result.columnFamilyId_ = columnFamilyId_;
      if (columnFamilyBuilder_ == null) {
        result.columnFamily_ = columnFamily_;
      } else {
        result.columnFamily_ = columnFamilyBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest) {
        return mergeFrom((com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest other) {
      if (other == com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getColumnFamilyId().isEmpty()) {
        columnFamilyId_ = other.columnFamilyId_;
        onChanged();
      }
      if (other.hasColumnFamily()) {
        mergeColumnFamily(other.getColumnFamily());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the table in which to create the new column family.
     * </pre>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the table in which to create the new column family.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the table in which to create the new column family.
     * </pre>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the table in which to create the new column family.
     * </pre>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the table in which to create the new column family.
     * </pre>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object columnFamilyId_ = "";
    /**
     * <code>optional string column_family_id = 2;</code>
     *
     * <pre>
     * The name by which the new column family should be referred to within the
     * table, e.g. "foobar" rather than "&lt;table_name&gt;/columnFamilies/foobar".
     * </pre>
     */
    public java.lang.String getColumnFamilyId() {
      java.lang.Object ref = columnFamilyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          columnFamilyId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string column_family_id = 2;</code>
     *
     * <pre>
     * The name by which the new column family should be referred to within the
     * table, e.g. "foobar" rather than "&lt;table_name&gt;/columnFamilies/foobar".
     * </pre>
     */
    public com.google.protobuf.ByteString
        getColumnFamilyIdBytes() {
      java.lang.Object ref = columnFamilyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        columnFamilyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string column_family_id = 2;</code>
     *
     * <pre>
     * The name by which the new column family should be referred to within the
     * table, e.g. "foobar" rather than "&lt;table_name&gt;/columnFamilies/foobar".
     * </pre>
     */
    public Builder setColumnFamilyId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      columnFamilyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string column_family_id = 2;</code>
     *
     * <pre>
     * The name by which the new column family should be referred to within the
     * table, e.g. "foobar" rather than "&lt;table_name&gt;/columnFamilies/foobar".
     * </pre>
     */
    public Builder clearColumnFamilyId() {
      
      columnFamilyId_ = getDefaultInstance().getColumnFamilyId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string column_family_id = 2;</code>
     *
     * <pre>
     * The name by which the new column family should be referred to within the
     * table, e.g. "foobar" rather than "&lt;table_name&gt;/columnFamilies/foobar".
     * </pre>
     */
    public Builder setColumnFamilyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      columnFamilyId_ = value;
      onChanged();
      return this;
    }

    private com.google.bigtable.admin.table.v1.ColumnFamily columnFamily_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.bigtable.admin.table.v1.ColumnFamily, com.google.bigtable.admin.table.v1.ColumnFamily.Builder, com.google.bigtable.admin.table.v1.ColumnFamilyOrBuilder> columnFamilyBuilder_;
    /**
     * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
     *
     * <pre>
     * The column family to create. The `name` field must be left blank.
     * </pre>
     */
    public boolean hasColumnFamily() {
      return columnFamilyBuilder_ != null || columnFamily_ != null;
    }
    /**
     * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
     *
     * <pre>
     * The column family to create. The `name` field must be left blank.
     * </pre>
     */
    public com.google.bigtable.admin.table.v1.ColumnFamily getColumnFamily() {
      if (columnFamilyBuilder_ == null) {
        return columnFamily_ == null ? com.google.bigtable.admin.table.v1.ColumnFamily.getDefaultInstance() : columnFamily_;
      } else {
        return columnFamilyBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
     *
     * <pre>
     * The column family to create. The `name` field must be left blank.
     * </pre>
     */
    public Builder setColumnFamily(com.google.bigtable.admin.table.v1.ColumnFamily value) {
      if (columnFamilyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        columnFamily_ = value;
        onChanged();
      } else {
        columnFamilyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
     *
     * <pre>
     * The column family to create. The `name` field must be left blank.
     * </pre>
     */
    public Builder setColumnFamily(
        com.google.bigtable.admin.table.v1.ColumnFamily.Builder builderForValue) {
      if (columnFamilyBuilder_ == null) {
        columnFamily_ = builderForValue.build();
        onChanged();
      } else {
        columnFamilyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
     *
     * <pre>
     * The column family to create. The `name` field must be left blank.
     * </pre>
     */
    public Builder mergeColumnFamily(com.google.bigtable.admin.table.v1.ColumnFamily value) {
      if (columnFamilyBuilder_ == null) {
        if (columnFamily_ != null) {
          columnFamily_ =
            com.google.bigtable.admin.table.v1.ColumnFamily.newBuilder(columnFamily_).mergeFrom(value).buildPartial();
        } else {
          columnFamily_ = value;
        }
        onChanged();
      } else {
        columnFamilyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
     *
     * <pre>
     * The column family to create. The `name` field must be left blank.
     * </pre>
     */
    public Builder clearColumnFamily() {
      if (columnFamilyBuilder_ == null) {
        columnFamily_ = null;
        onChanged();
      } else {
        columnFamily_ = null;
        columnFamilyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
     *
     * <pre>
     * The column family to create. The `name` field must be left blank.
     * </pre>
     */
    public com.google.bigtable.admin.table.v1.ColumnFamily.Builder getColumnFamilyBuilder() {
      
      onChanged();
      return getColumnFamilyFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
     *
     * <pre>
     * The column family to create. The `name` field must be left blank.
     * </pre>
     */
    public com.google.bigtable.admin.table.v1.ColumnFamilyOrBuilder getColumnFamilyOrBuilder() {
      if (columnFamilyBuilder_ != null) {
        return columnFamilyBuilder_.getMessageOrBuilder();
      } else {
        return columnFamily_ == null ?
            com.google.bigtable.admin.table.v1.ColumnFamily.getDefaultInstance() : columnFamily_;
      }
    }
    /**
     * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
     *
     * <pre>
     * The column family to create. The `name` field must be left blank.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.bigtable.admin.table.v1.ColumnFamily, com.google.bigtable.admin.table.v1.ColumnFamily.Builder, com.google.bigtable.admin.table.v1.ColumnFamilyOrBuilder> 
        getColumnFamilyFieldBuilder() {
      if (columnFamilyBuilder_ == null) {
        columnFamilyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.bigtable.admin.table.v1.ColumnFamily, com.google.bigtable.admin.table.v1.ColumnFamily.Builder, com.google.bigtable.admin.table.v1.ColumnFamilyOrBuilder>(
                getColumnFamily(),
                getParentForChildren(),
                isClean());
        columnFamily_ = null;
      }
      return columnFamilyBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.table.v1.CreateColumnFamilyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.table.v1.CreateColumnFamilyRequest)
  private static final com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest defaultInstance;static {
    defaultInstance = new com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest();
  }

  public static com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest getDefaultInstance() {
    return defaultInstance;
  }

  public com.google.bigtable.admin.table.v1.CreateColumnFamilyRequest getDefaultInstanceForType() {
    return defaultInstance;
  }

}

