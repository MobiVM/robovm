RoboVM Xcode project generator for Interface Builder
====================================================
The RoboVM doesn't provide any functionality to edit xib/storyboards at iOS side.
All changes to be done in Interface Builder. To simplify it simple xcode project is
generated that contains all classes that are exported by Custom class. These classes
expose IBOutlet/IBOutletCollection/IBAction/IBObservable to easy attach outlet to
corresponding field/setter in class