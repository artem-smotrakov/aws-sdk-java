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
package com.amazonaws.services.codecommit.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MergePullRequestBySquashRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MergePullRequestBySquashRequestMarshaller {

    private static final MarshallingInfo<String> PULLREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pullRequestId").build();
    private static final MarshallingInfo<String> REPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryName").build();
    private static final MarshallingInfo<String> SOURCECOMMITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceCommitId").build();
    private static final MarshallingInfo<String> CONFLICTDETAILLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conflictDetailLevel").build();
    private static final MarshallingInfo<String> CONFLICTRESOLUTIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conflictResolutionStrategy").build();
    private static final MarshallingInfo<String> COMMITMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("commitMessage").build();
    private static final MarshallingInfo<String> AUTHORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorName").build();
    private static final MarshallingInfo<String> EMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("email").build();
    private static final MarshallingInfo<Boolean> KEEPEMPTYFOLDERS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("keepEmptyFolders").build();
    private static final MarshallingInfo<StructuredPojo> CONFLICTRESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conflictResolution").build();

    private static final MergePullRequestBySquashRequestMarshaller instance = new MergePullRequestBySquashRequestMarshaller();

    public static MergePullRequestBySquashRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MergePullRequestBySquashRequest mergePullRequestBySquashRequest, ProtocolMarshaller protocolMarshaller) {

        if (mergePullRequestBySquashRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mergePullRequestBySquashRequest.getPullRequestId(), PULLREQUESTID_BINDING);
            protocolMarshaller.marshall(mergePullRequestBySquashRequest.getRepositoryName(), REPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(mergePullRequestBySquashRequest.getSourceCommitId(), SOURCECOMMITID_BINDING);
            protocolMarshaller.marshall(mergePullRequestBySquashRequest.getConflictDetailLevel(), CONFLICTDETAILLEVEL_BINDING);
            protocolMarshaller.marshall(mergePullRequestBySquashRequest.getConflictResolutionStrategy(), CONFLICTRESOLUTIONSTRATEGY_BINDING);
            protocolMarshaller.marshall(mergePullRequestBySquashRequest.getCommitMessage(), COMMITMESSAGE_BINDING);
            protocolMarshaller.marshall(mergePullRequestBySquashRequest.getAuthorName(), AUTHORNAME_BINDING);
            protocolMarshaller.marshall(mergePullRequestBySquashRequest.getEmail(), EMAIL_BINDING);
            protocolMarshaller.marshall(mergePullRequestBySquashRequest.getKeepEmptyFolders(), KEEPEMPTYFOLDERS_BINDING);
            protocolMarshaller.marshall(mergePullRequestBySquashRequest.getConflictResolution(), CONFLICTRESOLUTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
