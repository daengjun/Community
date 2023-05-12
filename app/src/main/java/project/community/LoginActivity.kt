package project.community

import MyProject.Community.R
import MyProject.Community.databinding.ActivityLoginBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class LoginActivity : AppCompatActivity() {
    private var mBinding: ActivityLoginBinding? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(mBinding!!.root)

    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }

}