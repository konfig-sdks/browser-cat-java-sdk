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
import java.time.OffsetDateTime;

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
 * Invoice
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Invoice {
  public static final String SERIALIZED_NAME_INV_ID = "invId";
  @SerializedName(SERIALIZED_NAME_INV_ID)
  private String invId;

  public static final String SERIALIZED_NAME_SUB_ID = "subId";
  @SerializedName(SERIALIZED_NAME_SUB_ID)
  private Object subId = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    DRAFT("draft"),
    
    OPEN("open"),
    
    VOID("void"),
    
    PAID("paid"),
    
    UNCOLLECTIBLE("uncollectible");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Object error = null;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_AMOUNT_DUE = "amountDue";
  @SerializedName(SERIALIZED_NAME_AMOUNT_DUE)
  private Integer amountDue;

  public static final String SERIALIZED_NAME_AMOUNT_PAID = "amountPaid";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PAID)
  private Integer amountPaid;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT = "totalDiscount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT)
  private Integer totalDiscount;

  public static final String SERIALIZED_NAME_TOTAL_TAX = "totalTax";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX)
  private Integer totalTax;

  public static final String SERIALIZED_NAME_BILLED_AT = "billedAt";
  @SerializedName(SERIALIZED_NAME_BILLED_AT)
  private OffsetDateTime billedAt;

  public static final String SERIALIZED_NAME_STRIPE_INV_ID = "stripeInvId";
  @SerializedName(SERIALIZED_NAME_STRIPE_INV_ID)
  private String stripeInvId;

  public static final String SERIALIZED_NAME_STRIPE_SUB_ID = "stripeSubId";
  @SerializedName(SERIALIZED_NAME_STRIPE_SUB_ID)
  private Object stripeSubId = null;

  public static final String SERIALIZED_NAME_STRIPE_CUS_ID = "stripeCusId";
  @SerializedName(SERIALIZED_NAME_STRIPE_CUS_ID)
  private Object stripeCusId = null;

  public Invoice() {
  }

  public Invoice invId(String invId) {
    
    
    
    
    this.invId = invId;
    return this;
  }

   /**
   * Invoice ID
   * @return invId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Invoice ID")

  public String getInvId() {
    return invId;
  }


  public void setInvId(String invId) {
    
    
    
    this.invId = invId;
  }


  public Invoice subId(Object subId) {
    
    
    
    
    this.subId = subId;
    return this;
  }

   /**
   * Get subId
   * @return subId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getSubId() {
    return subId;
  }


  public void setSubId(Object subId) {
    
    
    
    this.subId = subId;
  }


  public Invoice status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public Invoice error(Object error) {
    
    
    
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getError() {
    return error;
  }


  public void setError(Object error) {
    
    
    
    this.error = error;
  }


  public Invoice currency(String currency) {
    
    
    if (currency != null && currency.length() < 3) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 3.");
    }
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    if (currency != null && currency.length() < 3) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 3.");
    }
    this.currency = currency;
  }


  public Invoice amountDue(Integer amountDue) {
    if (amountDue != null && amountDue < 0) {
      throw new IllegalArgumentException("Invalid value for amountDue. Must be greater than or equal to 0.");
    }
    
    
    
    this.amountDue = amountDue;
    return this;
  }

   /**
   * Get amountDue
   * minimum: 0
   * @return amountDue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getAmountDue() {
    return amountDue;
  }


  public void setAmountDue(Integer amountDue) {
    if (amountDue != null && amountDue < 0) {
      throw new IllegalArgumentException("Invalid value for amountDue. Must be greater than or equal to 0.");
    }
    
    
    this.amountDue = amountDue;
  }


  public Invoice amountPaid(Integer amountPaid) {
    if (amountPaid != null && amountPaid < 0) {
      throw new IllegalArgumentException("Invalid value for amountPaid. Must be greater than or equal to 0.");
    }
    
    
    
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * Get amountPaid
   * minimum: 0
   * @return amountPaid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getAmountPaid() {
    return amountPaid;
  }


  public void setAmountPaid(Integer amountPaid) {
    if (amountPaid != null && amountPaid < 0) {
      throw new IllegalArgumentException("Invalid value for amountPaid. Must be greater than or equal to 0.");
    }
    
    
    this.amountPaid = amountPaid;
  }


  public Invoice total(Integer total) {
    if (total != null && total < 0) {
      throw new IllegalArgumentException("Invalid value for total. Must be greater than or equal to 0.");
    }
    
    
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * minimum: 0
   * @return total
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    if (total != null && total < 0) {
      throw new IllegalArgumentException("Invalid value for total. Must be greater than or equal to 0.");
    }
    
    
    this.total = total;
  }


  public Invoice totalDiscount(Integer totalDiscount) {
    if (totalDiscount != null && totalDiscount < 0) {
      throw new IllegalArgumentException("Invalid value for totalDiscount. Must be greater than or equal to 0.");
    }
    
    
    
    this.totalDiscount = totalDiscount;
    return this;
  }

   /**
   * Get totalDiscount
   * minimum: 0
   * @return totalDiscount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotalDiscount() {
    return totalDiscount;
  }


  public void setTotalDiscount(Integer totalDiscount) {
    if (totalDiscount != null && totalDiscount < 0) {
      throw new IllegalArgumentException("Invalid value for totalDiscount. Must be greater than or equal to 0.");
    }
    
    
    this.totalDiscount = totalDiscount;
  }


  public Invoice totalTax(Integer totalTax) {
    if (totalTax != null && totalTax < 0) {
      throw new IllegalArgumentException("Invalid value for totalTax. Must be greater than or equal to 0.");
    }
    
    
    
    this.totalTax = totalTax;
    return this;
  }

   /**
   * Get totalTax
   * minimum: 0
   * @return totalTax
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotalTax() {
    return totalTax;
  }


  public void setTotalTax(Integer totalTax) {
    if (totalTax != null && totalTax < 0) {
      throw new IllegalArgumentException("Invalid value for totalTax. Must be greater than or equal to 0.");
    }
    
    
    this.totalTax = totalTax;
  }


  public Invoice billedAt(OffsetDateTime billedAt) {
    
    
    
    
    this.billedAt = billedAt;
    return this;
  }

   /**
   * Get billedAt
   * @return billedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getBilledAt() {
    return billedAt;
  }


  public void setBilledAt(OffsetDateTime billedAt) {
    
    
    
    this.billedAt = billedAt;
  }


  public Invoice stripeInvId(String stripeInvId) {
    
    
    
    
    this.stripeInvId = stripeInvId;
    return this;
  }

   /**
   * Get stripeInvId
   * @return stripeInvId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStripeInvId() {
    return stripeInvId;
  }


  public void setStripeInvId(String stripeInvId) {
    
    
    
    this.stripeInvId = stripeInvId;
  }


  public Invoice stripeSubId(Object stripeSubId) {
    
    
    
    
    this.stripeSubId = stripeSubId;
    return this;
  }

   /**
   * Get stripeSubId
   * @return stripeSubId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getStripeSubId() {
    return stripeSubId;
  }


  public void setStripeSubId(Object stripeSubId) {
    
    
    
    this.stripeSubId = stripeSubId;
  }


  public Invoice stripeCusId(Object stripeCusId) {
    
    
    
    
    this.stripeCusId = stripeCusId;
    return this;
  }

   /**
   * Get stripeCusId
   * @return stripeCusId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getStripeCusId() {
    return stripeCusId;
  }


  public void setStripeCusId(Object stripeCusId) {
    
    
    
    this.stripeCusId = stripeCusId;
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
   * @return the Invoice instance itself
   */
  public Invoice putAdditionalProperty(String key, Object value) {
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
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.invId, invoice.invId) &&
        Objects.equals(this.subId, invoice.subId) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.error, invoice.error) &&
        Objects.equals(this.currency, invoice.currency) &&
        Objects.equals(this.amountDue, invoice.amountDue) &&
        Objects.equals(this.amountPaid, invoice.amountPaid) &&
        Objects.equals(this.total, invoice.total) &&
        Objects.equals(this.totalDiscount, invoice.totalDiscount) &&
        Objects.equals(this.totalTax, invoice.totalTax) &&
        Objects.equals(this.billedAt, invoice.billedAt) &&
        Objects.equals(this.stripeInvId, invoice.stripeInvId) &&
        Objects.equals(this.stripeSubId, invoice.stripeSubId) &&
        Objects.equals(this.stripeCusId, invoice.stripeCusId)&&
        Objects.equals(this.additionalProperties, invoice.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invId, subId, status, error, currency, amountDue, amountPaid, total, totalDiscount, totalTax, billedAt, stripeInvId, stripeSubId, stripeCusId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    sb.append("    invId: ").append(toIndentedString(invId)).append("\n");
    sb.append("    subId: ").append(toIndentedString(subId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amountDue: ").append(toIndentedString(amountDue)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    billedAt: ").append(toIndentedString(billedAt)).append("\n");
    sb.append("    stripeInvId: ").append(toIndentedString(stripeInvId)).append("\n");
    sb.append("    stripeSubId: ").append(toIndentedString(stripeSubId)).append("\n");
    sb.append("    stripeCusId: ").append(toIndentedString(stripeCusId)).append("\n");
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
    openapiFields.add("invId");
    openapiFields.add("subId");
    openapiFields.add("status");
    openapiFields.add("error");
    openapiFields.add("currency");
    openapiFields.add("amountDue");
    openapiFields.add("amountPaid");
    openapiFields.add("total");
    openapiFields.add("totalDiscount");
    openapiFields.add("totalTax");
    openapiFields.add("billedAt");
    openapiFields.add("stripeInvId");
    openapiFields.add("stripeSubId");
    openapiFields.add("stripeCusId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("invId");
    openapiRequiredFields.add("subId");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("error");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("amountDue");
    openapiRequiredFields.add("amountPaid");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("totalDiscount");
    openapiRequiredFields.add("totalTax");
    openapiRequiredFields.add("billedAt");
    openapiRequiredFields.add("stripeInvId");
    openapiRequiredFields.add("stripeSubId");
    openapiRequiredFields.add("stripeCusId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Invoice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Invoice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Invoice is not found in the empty JSON string", Invoice.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Invoice.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("invId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invId").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("stripeInvId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stripeInvId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stripeInvId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Invoice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Invoice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Invoice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Invoice.class));

       return (TypeAdapter<T>) new TypeAdapter<Invoice>() {
           @Override
           public void write(JsonWriter out, Invoice value) throws IOException {
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
           public Invoice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Invoice instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Invoice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Invoice
  * @throws IOException if the JSON string is invalid with respect to Invoice
  */
  public static Invoice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Invoice.class);
  }

 /**
  * Convert an instance of Invoice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

