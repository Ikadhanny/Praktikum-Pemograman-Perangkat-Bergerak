// Generated by view binder compiler. Do not edit!
package id.ikadhanny_19104082.authgoogle.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import id.ikadhanny_19104082.authgoogle.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton btnEmail;

  @NonNull
  public final ImageButton btnPhone;

  @NonNull
  public final Button btnSign;

  @NonNull
  public final EditText inputEmail;

  @NonNull
  public final EditText inputPassword;

  @NonNull
  public final ImageView ivIcon;

  @NonNull
  public final LinearLayout mainLayout;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView tvConneting;

  @NonNull
  public final TextView tvLogin;

  @NonNull
  public final TextView tvSignUp;

  @NonNull
  public final TextView tvTextAccount;

  private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull ImageButton btnEmail,
      @NonNull ImageButton btnPhone, @NonNull Button btnSign, @NonNull EditText inputEmail,
      @NonNull EditText inputPassword, @NonNull ImageView ivIcon, @NonNull LinearLayout mainLayout,
      @NonNull ProgressBar progressBar, @NonNull TextView tvConneting, @NonNull TextView tvLogin,
      @NonNull TextView tvSignUp, @NonNull TextView tvTextAccount) {
    this.rootView = rootView;
    this.btnEmail = btnEmail;
    this.btnPhone = btnPhone;
    this.btnSign = btnSign;
    this.inputEmail = inputEmail;
    this.inputPassword = inputPassword;
    this.ivIcon = ivIcon;
    this.mainLayout = mainLayout;
    this.progressBar = progressBar;
    this.tvConneting = tvConneting;
    this.tvLogin = tvLogin;
    this.tvSignUp = tvSignUp;
    this.tvTextAccount = tvTextAccount;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnEmail;
      ImageButton btnEmail = ViewBindings.findChildViewById(rootView, id);
      if (btnEmail == null) {
        break missingId;
      }

      id = R.id.btnPhone;
      ImageButton btnPhone = ViewBindings.findChildViewById(rootView, id);
      if (btnPhone == null) {
        break missingId;
      }

      id = R.id.btnSign;
      Button btnSign = ViewBindings.findChildViewById(rootView, id);
      if (btnSign == null) {
        break missingId;
      }

      id = R.id.inputEmail;
      EditText inputEmail = ViewBindings.findChildViewById(rootView, id);
      if (inputEmail == null) {
        break missingId;
      }

      id = R.id.inputPassword;
      EditText inputPassword = ViewBindings.findChildViewById(rootView, id);
      if (inputPassword == null) {
        break missingId;
      }

      id = R.id.ivIcon;
      ImageView ivIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivIcon == null) {
        break missingId;
      }

      LinearLayout mainLayout = (LinearLayout) rootView;

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.tvConneting;
      TextView tvConneting = ViewBindings.findChildViewById(rootView, id);
      if (tvConneting == null) {
        break missingId;
      }

      id = R.id.tvLogin;
      TextView tvLogin = ViewBindings.findChildViewById(rootView, id);
      if (tvLogin == null) {
        break missingId;
      }

      id = R.id.tvSignUp;
      TextView tvSignUp = ViewBindings.findChildViewById(rootView, id);
      if (tvSignUp == null) {
        break missingId;
      }

      id = R.id.tvTextAccount;
      TextView tvTextAccount = ViewBindings.findChildViewById(rootView, id);
      if (tvTextAccount == null) {
        break missingId;
      }

      return new ActivityLoginBinding((LinearLayout) rootView, btnEmail, btnPhone, btnSign,
          inputEmail, inputPassword, ivIcon, mainLayout, progressBar, tvConneting, tvLogin,
          tvSignUp, tvTextAccount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}