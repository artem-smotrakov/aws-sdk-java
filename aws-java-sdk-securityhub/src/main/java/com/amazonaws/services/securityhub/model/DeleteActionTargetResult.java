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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteActionTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteActionTargetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the custom action target that was deleted.
     * </p>
     */
    private String actionTargetArn;

    /**
     * <p>
     * The ARN of the custom action target that was deleted.
     * </p>
     * 
     * @param actionTargetArn
     *        The ARN of the custom action target that was deleted.
     */

    public void setActionTargetArn(String actionTargetArn) {
        this.actionTargetArn = actionTargetArn;
    }

    /**
     * <p>
     * The ARN of the custom action target that was deleted.
     * </p>
     * 
     * @return The ARN of the custom action target that was deleted.
     */

    public String getActionTargetArn() {
        return this.actionTargetArn;
    }

    /**
     * <p>
     * The ARN of the custom action target that was deleted.
     * </p>
     * 
     * @param actionTargetArn
     *        The ARN of the custom action target that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteActionTargetResult withActionTargetArn(String actionTargetArn) {
        setActionTargetArn(actionTargetArn);
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
        if (getActionTargetArn() != null)
            sb.append("ActionTargetArn: ").append(getActionTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteActionTargetResult == false)
            return false;
        DeleteActionTargetResult other = (DeleteActionTargetResult) obj;
        if (other.getActionTargetArn() == null ^ this.getActionTargetArn() == null)
            return false;
        if (other.getActionTargetArn() != null && other.getActionTargetArn().equals(this.getActionTargetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionTargetArn() == null) ? 0 : getActionTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteActionTargetResult clone() {
        try {
            return (DeleteActionTargetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
