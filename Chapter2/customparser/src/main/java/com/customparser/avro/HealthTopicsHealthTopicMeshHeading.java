/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.customparser.avro;  
@SuppressWarnings("all")
public class HealthTopicsHealthTopicMeshHeading extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"HealthTopicsHealthTopicMeshHeading\",\"namespace\":\"com.medline.avro\",\"fields\":[{\"name\":\"descriptor\",\"type\":{\"type\":\"record\",\"name\":\"HealthTopicsHealthTopicMeshHeadingDescriptor\",\"fields\":[{\"name\":\"value\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":\"null\"}]}},{\"name\":\"qualifier\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"HealthTopicsHealthTopicMeshHeadingQualifier\",\"fields\":[{\"name\":\"value\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":\"null\"}]}],\"default\":\"null\"}]}");
  public com.customparser.avro.HealthTopicsHealthTopicMeshHeadingDescriptor descriptor;
  public com.customparser.avro.HealthTopicsHealthTopicMeshHeadingQualifier qualifier;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return descriptor;
    case 1: return qualifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: descriptor = (com.customparser.avro.HealthTopicsHealthTopicMeshHeadingDescriptor)value$; break;
    case 1: qualifier = (com.customparser.avro.HealthTopicsHealthTopicMeshHeadingQualifier)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}