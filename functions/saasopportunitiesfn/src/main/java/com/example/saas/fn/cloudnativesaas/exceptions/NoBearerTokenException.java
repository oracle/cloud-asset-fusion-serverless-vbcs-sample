/*
Copyright © 2020, Oracle and/or its affiliates. All rights reserved.
Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.
*/

package com.example.saas.fn.cloudnativesaas.exceptions;

public class NoBearerTokenException extends Exception{
    public NoBearerTokenException(String message) {
        super(message);
    }
}