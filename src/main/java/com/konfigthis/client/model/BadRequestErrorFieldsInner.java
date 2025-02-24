/*
 * BrowserCat API
 * Providing purr-fect headless browser access via utility endpoints and direct websocket connections.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@browsercat.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * BadRequestErrorFieldsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BadRequestErrorFieldsInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_EXPECTED = "expected";
  @SerializedName(SERIALIZED_NAME_EXPECTED)
  private String expected;

  public static final String SERIALIZED_NAME_RECEIVED = "received";
  @SerializedName(SERIALIZED_NAME_RECEIVED)
  private String received;

  public static final String SERIALIZED_NAME_VALIDATION = "validation";
  @SerializedName(SERIALIZED_NAME_VALIDATION)
  private String validation;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private List<Object> path = new ArrayList<>();

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public BadRequestErrorFieldsInner() {
  }

  public BadRequestErrorFieldsInner code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public BadRequestErrorFieldsInner expected(String expected) {
    
    
    
    
    this.expected = expected;
    return this;
  }

   /**
   * Get expected
   * @return expected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpected() {
    return expected;
  }


  public void setExpected(String expected) {
    
    
    
    this.expected = expected;
  }


  public BadRequestErrorFieldsInner received(String received) {
    
    
    
    
    this.received = received;
    return this;
  }

   /**
   * Get received
   * @return received
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReceived() {
    return received;
  }


  public void setReceived(String received) {
    
    
    
    this.received = received;
  }


  public BadRequestErrorFieldsInner validation(String validation) {
    
    
    
    
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValidation() {
    return validation;
  }


  public void setValidation(String validation) {
    
    
    
    this.validation = validation;
  }


  public BadRequestErrorFieldsInner path(List<Object> path) {
    
    
    
    
    this.path = path;
    return this;
  }

  public BadRequestErrorFieldsInner addPathItem(Object pathItem) {
    this.path.add(pathItem);
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getPath() {
    return path;
  }


  public void setPath(List<Object> path) {
    
    
    
    this.path = path;
  }


  public BadRequestErrorFieldsInner message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the BadRequestErrorFieldsInner instance itself
   */
  public BadRequestErrorFieldsInner putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadRequestErrorFieldsInner badRequestErrorFieldsInner = (BadRequestErrorFieldsInner) o;
    return Objects.equals(this.code, badRequestErrorFieldsInner.code) &&
        Objects.equals(this.expected, badRequestErrorFieldsInner.expected) &&
        Objects.equals(this.received, badRequestErrorFieldsInner.received) &&
        Objects.equals(this.validation, badRequestErrorFieldsInner.validation) &&
        Objects.equals(this.path, badRequestErrorFieldsInner.path) &&
        Objects.equals(this.message, badRequestErrorFieldsInner.message)&&
        Objects.equals(this.additionalProperties, badRequestErrorFieldsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, expected, received, validation, path, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestErrorFieldsInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("code");
    openapiFields.add("expected");
    openapiFields.add("received");
    openapiFields.add("validation");
    openapiFields.add("path");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("path");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BadRequestErrorFieldsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BadRequestErrorFieldsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BadRequestErrorFieldsInner is not found in the empty JSON string", BadRequestErrorFieldsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BadRequestErrorFieldsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("expected") != null && !jsonObj.get("expected").isJsonNull()) && !jsonObj.get("expected").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expected` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expected").toString()));
      }
      if ((jsonObj.get("received") != null && !jsonObj.get("received").isJsonNull()) && !jsonObj.get("received").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `received` to be a primitive type in the JSON string but got `%s`", jsonObj.get("received").toString()));
      }
      if ((jsonObj.get("validation") != null && !jsonObj.get("validation").isJsonNull()) && !jsonObj.get("validation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validation").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("path") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("path").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be an array in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BadRequestErrorFieldsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BadRequestErrorFieldsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BadRequestErrorFieldsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BadRequestErrorFieldsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BadRequestErrorFieldsInner>() {
           @Override
           public void write(JsonWriter out, BadRequestErrorFieldsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public BadRequestErrorFieldsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BadRequestErrorFieldsInner instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BadRequestErrorFieldsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BadRequestErrorFieldsInner
  * @throws IOException if the JSON string is invalid with respect to BadRequestErrorFieldsInner
  */
  public static BadRequestErrorFieldsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BadRequestErrorFieldsInner.class);
  }

 /**
  * Convert an instance of BadRequestErrorFieldsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

