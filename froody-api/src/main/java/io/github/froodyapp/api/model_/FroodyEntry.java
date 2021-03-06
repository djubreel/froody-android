/*
 * Froody API
 * API for Froody - http://froody-app.at/
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.github.froodyapp.api.model_;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * Represents an entry in the froody database, with its id, location and other details
 */
@ApiModel(description = "Represents an entry in the froody database, with its id, location and other details")

public class FroodyEntry implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("entryId")
  private Long entryId = null;

  @SerializedName("userId")
  private Long userId = -1l;

  @SerializedName("geohash")
  private String geohash = "";

  @SerializedName("creationDate")
  private DateTime creationDate = null;

  @SerializedName("modificationDate")
  private DateTime modificationDate = null;

  @SerializedName("entryType")
  private Integer entryType = null;

  @SerializedName("certificationType")
  private Integer certificationType = 0;

  @SerializedName("distributionType")
  private Integer distributionType = 0;

  @SerializedName("description")
  private String description = "";

  @SerializedName("contact")
  private String contact = "";

  @SerializedName("address")
  private String address = "";

  @SerializedName("wasDeleted")
  private Boolean wasDeleted = false;

  @SerializedName("managementCode")
  private Integer managementCode = -1;

  public FroodyEntry entryId(Long entryId) {
    this.entryId = entryId;
    return this;
  }

   /**
   * Entry ** Unique ID representing the entry ID in the database
   * @return entryId
  **/
  @ApiModelProperty(value = "Entry ** Unique ID representing the entry ID in the database")
  public Long getEntryId() {
    return entryId;
  }

  public void setEntryId(Long entryId) {
    this.entryId = entryId;
  }

  public FroodyEntry userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User.userId ** UserId that this entry belongs to. -1 if not belongs to client
   * @return userId
  **/
  @ApiModelProperty(value = "User.userId ** UserId that this entry belongs to. -1 if not belongs to client")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public FroodyEntry geohash(String geohash) {
    this.geohash = geohash;
    return this;
  }

   /**
   * Entry ** GeoHash of location(lat,lng) with precision >= 9
   * @return geohash
  **/
  @ApiModelProperty(value = "Entry ** GeoHash of location(lat,lng) with precision >= 9")
  public String getGeohash() {
    return geohash;
  }

  public void setGeohash(String geohash) {
    this.geohash = geohash;
  }

  public FroodyEntry creationDate(DateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Entry ** Timestamp of creation
   * @return creationDate
  **/
  @ApiModelProperty(value = "Entry ** Timestamp of creation")
  public DateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(DateTime creationDate) {
    this.creationDate = creationDate;
  }

  public FroodyEntry modificationDate(DateTime modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * Entry ** Timestamp of modification
   * @return modificationDate
  **/
  @ApiModelProperty(value = "Entry ** Timestamp of modification")
  public DateTime getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(DateTime modificationDate) {
    this.modificationDate = modificationDate;
  }

  public FroodyEntry entryType(Integer entryType) {
    this.entryType = entryType;
    return this;
  }

   /**
   * Entry ** Type of entry (e.g. pear, apple)
   * @return entryType
  **/
  @ApiModelProperty(value = "Entry ** Type of entry (e.g. pear, apple)")
  public Integer getEntryType() {
    return entryType;
  }

  public void setEntryType(Integer entryType) {
    this.entryType = entryType;
  }

  public FroodyEntry certificationType(Integer certificationType) {
    this.certificationType = certificationType;
    return this;
  }

   /**
   * Entry ** Type of certification (None=0/bio=1/demeter=2)
   * @return certificationType
  **/
  @ApiModelProperty(value = "Entry ** Type of certification (None=0/bio=1/demeter=2)")
  public Integer getCertificationType() {
    return certificationType;
  }

  public void setCertificationType(Integer certificationType) {
    this.certificationType = certificationType;
  }

  public FroodyEntry distributionType(Integer distributionType) {
    this.distributionType = distributionType;
    return this;
  }

   /**
   * Entry ** Type of distribution (Free=0/Selling=1/..)
   * @return distributionType
  **/
  @ApiModelProperty(value = "Entry ** Type of distribution (Free=0/Selling=1/..)")
  public Integer getDistributionType() {
    return distributionType;
  }

  public void setDistributionType(Integer distributionType) {
    this.distributionType = distributionType;
  }

  public FroodyEntry description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Entry ** Description what is offered
   * @return description
  **/
  @ApiModelProperty(value = "Entry ** Description what is offered")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FroodyEntry contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Entry ** Contact informations
   * @return contact
  **/
  @ApiModelProperty(value = "Entry ** Contact informations")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public FroodyEntry address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Entry ** Resolved address from latitude and longitude
   * @return address
  **/
  @ApiModelProperty(value = "Entry ** Resolved address from latitude and longitude")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public FroodyEntry wasDeleted(Boolean wasDeleted) {
    this.wasDeleted = wasDeleted;
    return this;
  }

   /**
   * Entry ** True if the entry was requested for deletion
   * @return wasDeleted
  **/
  @ApiModelProperty(value = "Entry ** True if the entry was requested for deletion")
  public Boolean getWasDeleted() {
    return wasDeleted;
  }

  public void setWasDeleted(Boolean wasDeleted) {
    this.wasDeleted = wasDeleted;
  }

  public FroodyEntry managementCode(Integer managementCode) {
    this.managementCode = managementCode;
    return this;
  }

   /**
   * Entry ** Management code, or -1 if not belongs to client
   * @return managementCode
  **/
  @ApiModelProperty(value = "Entry ** Management code, or -1 if not belongs to client")
  public Integer getManagementCode() {
    return managementCode;
  }

  public void setManagementCode(Integer managementCode) {
    this.managementCode = managementCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FroodyEntry froodyEntry = (FroodyEntry) o;
    return Objects.equals(this.entryId, froodyEntry.entryId) &&
        Objects.equals(this.userId, froodyEntry.userId) &&
        Objects.equals(this.geohash, froodyEntry.geohash) &&
        Objects.equals(this.creationDate, froodyEntry.creationDate) &&
        Objects.equals(this.modificationDate, froodyEntry.modificationDate) &&
        Objects.equals(this.entryType, froodyEntry.entryType) &&
        Objects.equals(this.certificationType, froodyEntry.certificationType) &&
        Objects.equals(this.distributionType, froodyEntry.distributionType) &&
        Objects.equals(this.description, froodyEntry.description) &&
        Objects.equals(this.contact, froodyEntry.contact) &&
        Objects.equals(this.address, froodyEntry.address) &&
        Objects.equals(this.wasDeleted, froodyEntry.wasDeleted) &&
        Objects.equals(this.managementCode, froodyEntry.managementCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryId, userId, geohash, creationDate, modificationDate, entryType, certificationType, distributionType, description, contact, address, wasDeleted, managementCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FroodyEntry {\n");
    
    sb.append("    entryId: ").append(toIndentedString(entryId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    geohash: ").append(toIndentedString(geohash)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    certificationType: ").append(toIndentedString(certificationType)).append("\n");
    sb.append("    distributionType: ").append(toIndentedString(distributionType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    wasDeleted: ").append(toIndentedString(wasDeleted)).append("\n");
    sb.append("    managementCode: ").append(toIndentedString(managementCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

