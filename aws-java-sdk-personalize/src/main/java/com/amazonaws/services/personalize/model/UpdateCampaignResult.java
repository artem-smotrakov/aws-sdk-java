/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateCampaign" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCampaignResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The same campaign ARN as given in the request.
     * </p>
     */
    private String campaignArn;

    /**
     * <p>
     * The same campaign ARN as given in the request.
     * </p>
     * 
     * @param campaignArn
     *        The same campaign ARN as given in the request.
     */

    public void setCampaignArn(String campaignArn) {
        this.campaignArn = campaignArn;
    }

    /**
     * <p>
     * The same campaign ARN as given in the request.
     * </p>
     * 
     * @return The same campaign ARN as given in the request.
     */

    public String getCampaignArn() {
        return this.campaignArn;
    }

    /**
     * <p>
     * The same campaign ARN as given in the request.
     * </p>
     * 
     * @param campaignArn
     *        The same campaign ARN as given in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignResult withCampaignArn(String campaignArn) {
        setCampaignArn(campaignArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCampaignArn() != null)
            sb.append("CampaignArn: ").append(getCampaignArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCampaignResult == false)
            return false;
        UpdateCampaignResult other = (UpdateCampaignResult) obj;
        if (other.getCampaignArn() == null ^ this.getCampaignArn() == null)
            return false;
        if (other.getCampaignArn() != null && other.getCampaignArn().equals(this.getCampaignArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignArn() == null) ? 0 : getCampaignArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCampaignResult clone() {
        try {
            return (UpdateCampaignResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
