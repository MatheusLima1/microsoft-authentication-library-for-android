//  Copyright (c) Microsoft Corporation.
//  All rights reserved.
//
//  This code is licensed under the MIT License.
//
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files(the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and / or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions :
//
//  The above copyright notice and this permission notice shall be included in
//  all copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
//  THE SOFTWARE.

package com.microsoft.identity.client;


/**
 * Interface for apps to configure the external logging and implement the callback to designate the customize
 * place for where to output the log messages.
 */
public interface ILogger {
    /**
     * Interface method for apps to hand off each log message as it's generated.
     * @param tag The TAG for the log message. The SDK send the component name(the class where the
     *            log is generated).
     * @param logLevel The {@link Logger.LogLevel} for the generated message.
     * @param message The detailed message. Will not contain any PII info.
     * @param containsPII True if the log message contains PII, false otherwise. If enablePII is not set
     *                    on the {@link Logger},
     */
    void log(String tag, Logger.LogLevel logLevel, String message, boolean containsPII);
}
