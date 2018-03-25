/*
 * Copyright (C) 2014 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.robovm.junit.protocol;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Wrapper JUnit result class to facilitate serialization through JSON
 */
public class ResultObject {

    static Gson gson = new GsonBuilder()
        .registerTypeAdapter(Description.class, new DescriptionTypeAdapter())
        .registerTypeAdapter(Throwable.class, new ThrowableTypeAdapter())
        .create();
    
    ResultType resultType;
    Description description;
    Result result;
    Failure failure;

    public ResultObject() {
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ResultType getResultType() {
        return resultType;
    }

    public void setResultType(ResultType resultType) {
        this.resultType = resultType;
    }

    public Failure getFailure() {
        return failure;
    }

    public void setFailure(Failure failure) {
        this.failure = failure;
    }
    
    public String toJson() {
        return gson.toJson(this);
    }

    public static ResultObject fromJson(String jsonString) {
        return gson.fromJson(jsonString, ResultObject.class);
    }
}
