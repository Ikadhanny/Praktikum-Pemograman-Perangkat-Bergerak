// Generated by view binder compiler. Do not edit!
package id.ikadhanny_19104082.intentexim.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import id.ikadhanny_19104082.intentexim.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityPractice5ForFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout frameContainer;

  private ActivityPractice5ForFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout frameContainer) {
    this.rootView = rootView;
    this.frameContainer = frameContainer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPractice5ForFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPractice5ForFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_practice5_for_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPractice5ForFragmentBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ConstraintLayout frameContainer = (ConstraintLayout) rootView;

    return new ActivityPractice5ForFragmentBinding((ConstraintLayout) rootView, frameContainer);
  }
}
