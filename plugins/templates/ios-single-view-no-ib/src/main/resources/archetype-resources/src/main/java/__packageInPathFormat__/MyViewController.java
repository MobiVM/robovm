${package}

import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.uikit.NSTextAlignment;
import org.robovm.apple.uikit.UIButton;
import org.robovm.apple.uikit.UIButtonType;
import org.robovm.apple.uikit.UIColor;
import org.robovm.apple.uikit.UIControl;
import org.robovm.apple.uikit.UIControlState;
import org.robovm.apple.uikit.UIEvent;
import org.robovm.apple.uikit.UIFont;
import org.robovm.apple.uikit.UILabel;
import org.robovm.apple.uikit.UIView;
import org.robovm.apple.uikit.UIViewController;

public class MyViewController extends UIViewController {
    private final UIButton button;
    private final UILabel label;
    private int clickCount;

    public MyViewController() {
        // Get the view of this view controller.
        UIView view = getView();

        // Setup background.
        view.setBackgroundColor(UIColor.white());

        // Setup label.
        label = new UILabel(new CGRect(20, 250, 280, 44));
        label.setFont(UIFont.getSystemFont(24));
        label.setTextAlignment(NSTextAlignment.Center);
        view.addSubview(label);

        // Setup button.
        button = new UIButton(UIButtonType.RoundedRect);
        button.setFrame(new CGRect(110, 150, 100, 40));
        button.setTitle("Click me!", UIControlState.Normal);
        button.getTitleLabel().setFont(UIFont.getBoldSystemFont(22));

        button.addOnTouchUpInsideListener((control, event) -> label.setText("Click Nr. " + (++clickCount)));
        view.addSubview(button);
    }
}
