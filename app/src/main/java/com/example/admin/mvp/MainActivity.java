package com.example.admin.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.mvp.xulylogin.PresenterlLogicXuLyDangNhap;
import com.example.admin.mvp.xulylogin.ViewXuLyDangNhap;

public class MainActivity extends AppCompatActivity implements ViewXuLyDangNhap,View.OnClickListener {

    private EditText edName, edPass;
    private Button btLogin;

    private PresenterlLogicXuLyDangNhap logicXuLyDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
    }

    @Override
    public void dangNhapThnahCong(String thongBao) {
        Toast.makeText(MainActivity.this, "thành công " + thongBao ,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void dangNhapThatBai() {
        Toast.makeText(MainActivity.this, "thất bại",Toast.LENGTH_SHORT).show();
    }

    private void anhXa(){
        edName = (EditText) findViewById(R.id.edEmail);
        edPass = (EditText) findViewById(R.id.edPass);
        btLogin = (Button) findViewById(R.id.btLogin);

        logicXuLyDangNhap = new PresenterlLogicXuLyDangNhap(this);
        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String nameDN;
        String passDN;

        nameDN = edName.getText().toString();
        passDN = edPass.getText().toString();
        logicXuLyDangNhap.kiemTraDangNhap(nameDN, passDN);
    }
}
