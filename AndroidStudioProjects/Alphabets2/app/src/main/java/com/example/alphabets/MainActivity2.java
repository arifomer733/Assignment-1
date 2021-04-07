package com.example.alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btna;
    Button btnb;
    Button btnc;
    Button btnd;
    Button btne;
    Button btnf;
    Button btng;
    Button btnh;
    Button btni;
    Button btnj;
    Button btnk;
    Button btnl;
    Button btnm;
    Button btnn;
    Button btno;
    Button btnp;
    Button btnq;
    Button btnr;
    Button btns;
    Button btnt;
    Button btnu;
    Button btnv;
    Button btnw;
    Button btnx;
    Button btny;
    Button btnz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btna = (Button) findViewById(R.id.a);
        final MediaPlayer a = MediaPlayer.create(this, R.raw.a);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.start();
            }
        });

        btnb = (Button) findViewById(R.id.b);
        final MediaPlayer b = MediaPlayer.create(this, R.raw.b);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.start();
            }
        });

        btnc = (Button) findViewById(R.id.c);
        final MediaPlayer c = MediaPlayer.create(this, R.raw.c);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.start();
            }
        });

        btnd = (Button) findViewById(R.id.d);
        final MediaPlayer d = MediaPlayer.create(this, R.raw.d);
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.start();
            }
        });

        btne = (Button) findViewById(R.id.e);
        final MediaPlayer e = MediaPlayer.create(this, R.raw.e);
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.start();
            }
        });

        btnf = (Button) findViewById(R.id.f);
        final MediaPlayer f = MediaPlayer.create(this, R.raw.f);
        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f.start();
            }
        });

        btng = (Button) findViewById(R.id.g);
        final MediaPlayer g = MediaPlayer.create(this, R.raw.g);
        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.start();
            }
        });

        btnh = (Button) findViewById(R.id.h);
        final MediaPlayer h = MediaPlayer.create(this, R.raw.h);
        btnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h.start();
            }
        });

        btni = (Button) findViewById(R.id.i);
        final MediaPlayer i = MediaPlayer.create(this, R.raw.i);
        btni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.start();
            }
        });

        btnj = (Button) findViewById(R.id.j);
        final MediaPlayer j = MediaPlayer.create(this, R.raw.j);
        btnj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j.start();
            }
        });

        btnk = (Button) findViewById(R.id.k);
        final MediaPlayer k = MediaPlayer.create(this, R.raw.k);
        btnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k.start();
            }
        });

        btnl = (Button) findViewById(R.id.l);
        final MediaPlayer l = MediaPlayer.create(this, R.raw.l);
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l.start();
            }
        });

        btnm = (Button) findViewById(R.id.m);
        final MediaPlayer m = MediaPlayer.create(this, R.raw.m);
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m.start();
            }
        });

        btnn = (Button) findViewById(R.id.n);
        final MediaPlayer n = MediaPlayer.create(this, R.raw.n);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.start();
            }
        });

        btno = (Button) findViewById(R.id.o);
        final MediaPlayer o = MediaPlayer.create(this, R.raw.o);
        btno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o.start();
            }
        });

        btnp = (Button) findViewById(R.id.p);
        final MediaPlayer p = MediaPlayer.create(this, R.raw.p);
        btnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p.start();
            }
        });

        btnq = (Button) findViewById(R.id.q);
        final MediaPlayer q = MediaPlayer.create(this, R.raw.q);
        btnq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q.start();
            }
        });

        btnr = (Button) findViewById(R.id.r);
        final MediaPlayer r = MediaPlayer.create(this, R.raw.r);
        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.start();
            }
        });

        btns = (Button) findViewById(R.id.s);
        final MediaPlayer s = MediaPlayer.create(this, R.raw.s);
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
            }
        });

        btnt = (Button) findViewById(R.id.t);
        final MediaPlayer t = MediaPlayer.create(this, R.raw.t);
        btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.start();
            }
        });

        btnu = (Button) findViewById(R.id.u);
        final MediaPlayer u = MediaPlayer.create(this, R.raw.u);
        btnu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u.start();
            }
        });

        btnv = (Button) findViewById(R.id.v);
        final MediaPlayer ve = MediaPlayer.create(this, R.raw.v);
        btnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ve.start();
            }
        });

        btnw = (Button) findViewById(R.id.w);
        final MediaPlayer w = MediaPlayer.create(this, R.raw.w);
        btnw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w.start();
            }
        });

        btnx = (Button) findViewById(R.id.x);
        final MediaPlayer x = MediaPlayer.create(this, R.raw.x);
        btnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.start();
            }
        });

        btny = (Button) findViewById(R.id.y);
        final MediaPlayer y = MediaPlayer.create(this, R.raw.y);
        btny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y.start();
            }
        });

        btnz = (Button) findViewById(R.id.z);
        final MediaPlayer z = MediaPlayer.create(this, R.raw.z);
        btnz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z.start();
            }
        });

    }
}