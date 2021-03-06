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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayPeeringAttachmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The transit gateway peering attachments.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TransitGatewayPeeringAttachment> transitGatewayPeeringAttachments;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The transit gateway peering attachments.
     * </p>
     * 
     * @return The transit gateway peering attachments.
     */

    public java.util.List<TransitGatewayPeeringAttachment> getTransitGatewayPeeringAttachments() {
        if (transitGatewayPeeringAttachments == null) {
            transitGatewayPeeringAttachments = new com.amazonaws.internal.SdkInternalList<TransitGatewayPeeringAttachment>();
        }
        return transitGatewayPeeringAttachments;
    }

    /**
     * <p>
     * The transit gateway peering attachments.
     * </p>
     * 
     * @param transitGatewayPeeringAttachments
     *        The transit gateway peering attachments.
     */

    public void setTransitGatewayPeeringAttachments(java.util.Collection<TransitGatewayPeeringAttachment> transitGatewayPeeringAttachments) {
        if (transitGatewayPeeringAttachments == null) {
            this.transitGatewayPeeringAttachments = null;
            return;
        }

        this.transitGatewayPeeringAttachments = new com.amazonaws.internal.SdkInternalList<TransitGatewayPeeringAttachment>(transitGatewayPeeringAttachments);
    }

    /**
     * <p>
     * The transit gateway peering attachments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitGatewayPeeringAttachments(java.util.Collection)} or
     * {@link #withTransitGatewayPeeringAttachments(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transitGatewayPeeringAttachments
     *        The transit gateway peering attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayPeeringAttachmentsResult withTransitGatewayPeeringAttachments(
            TransitGatewayPeeringAttachment... transitGatewayPeeringAttachments) {
        if (this.transitGatewayPeeringAttachments == null) {
            setTransitGatewayPeeringAttachments(new com.amazonaws.internal.SdkInternalList<TransitGatewayPeeringAttachment>(
                    transitGatewayPeeringAttachments.length));
        }
        for (TransitGatewayPeeringAttachment ele : transitGatewayPeeringAttachments) {
            this.transitGatewayPeeringAttachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The transit gateway peering attachments.
     * </p>
     * 
     * @param transitGatewayPeeringAttachments
     *        The transit gateway peering attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayPeeringAttachmentsResult withTransitGatewayPeeringAttachments(
            java.util.Collection<TransitGatewayPeeringAttachment> transitGatewayPeeringAttachments) {
        setTransitGatewayPeeringAttachments(transitGatewayPeeringAttachments);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayPeeringAttachmentsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTransitGatewayPeeringAttachments() != null)
            sb.append("TransitGatewayPeeringAttachments: ").append(getTransitGatewayPeeringAttachments()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTransitGatewayPeeringAttachmentsResult == false)
            return false;
        DescribeTransitGatewayPeeringAttachmentsResult other = (DescribeTransitGatewayPeeringAttachmentsResult) obj;
        if (other.getTransitGatewayPeeringAttachments() == null ^ this.getTransitGatewayPeeringAttachments() == null)
            return false;
        if (other.getTransitGatewayPeeringAttachments() != null
                && other.getTransitGatewayPeeringAttachments().equals(this.getTransitGatewayPeeringAttachments()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayPeeringAttachments() == null) ? 0 : getTransitGatewayPeeringAttachments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTransitGatewayPeeringAttachmentsResult clone() {
        try {
            return (DescribeTransitGatewayPeeringAttachmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
