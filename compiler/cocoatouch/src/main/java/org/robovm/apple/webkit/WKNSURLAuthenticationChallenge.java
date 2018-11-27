package org.robovm.apple.webkit;

import org.robovm.apple.foundation.NSURLAuthenticationChallenge;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.Library;


/**
 * dkimitsa: this is very special workaround for bug #336
 * it happens when didReceiveAuthenticationChallenge navigation delegate's
 * callback being called and challenge is instance of WKNSURLAuthenticationChallenge class
 * the issue here is that WKNSURLAuthenticationChallenge itself doesn't inherit
 * NSURLAuthenticationChallenge and RoboVM can't build java object for it as it is not known
 * and hangs with exception. WKNSURLAuthenticationChallenge is a NSProxy which is ok
 * on obj-c side.
 * Workaround is to register empty WKNSURLAuthenticationChallenge with methods of
 * NSURLAuthenticationChallenge. It will not make harm on obj-c side as it is proxy and will deal
 * with all selectors being sent
 */
@Library("WebKit") @NativeClass
public class WKNSURLAuthenticationChallenge extends NSURLAuthenticationChallenge {
}
