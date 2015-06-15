package com.vmware.spbm;

/**
 * Created by Michael Rice on Fri May 29 03:07:52 CDT 2015
 * This code is auto generated using yavijava_generator
 * https://github.com/yavijava/yavijava_generator
 *
 * Copyright 2015 Michael Rice
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * @since 6.0
 */

public enum PbmObjectType {

    virtualMachine("virtualMachine"),
    virtualDiskId("virtualDiskId"),
    virtualDiskUUID("virtualDiskUUID"),
    datastore("datastore"),
    unknown("unknown");

    private String val;

    PbmObjectType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return this.val;
    }
}