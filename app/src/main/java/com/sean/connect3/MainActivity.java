package com.sean.connect3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int leftcolumncount=0;
    int middlecolumncount=0;
    int rightcolumncount=0;
public void action(View view) {
    switch (view.getId()) {

        case R.id.leftcolumnred: {
            if (leftcolumncount < 3) {
                if (leftcolumncount == 0) {
                    ImageView leftimage1 = (ImageView) findViewById(R.id.imageView7);
                    leftimage1.setImageResource(R.drawable.redcounter);
                } else if (leftcolumncount == 1) {
                    ImageView leftimage2 = (ImageView) findViewById(R.id.imageView4);
                    leftimage2.setImageResource(R.drawable.redcounter);
                } else if (leftcolumncount == 2) {
                    ImageView leftimage3 = (ImageView) findViewById(R.id.imageView);
                    leftimage3.setImageResource(R.drawable.redcounter);
                }
            }
            leftcolumncount++;
            break;
        }

        case R.id.middlecolumnred: {
            if (middlecolumncount < 3) {
                if (middlecolumncount == 0) {
                    ImageView middleimage1 = (ImageView) findViewById(R.id.imageView8);
                    middleimage1.setImageResource(R.drawable.redcounter);
                } else if (middlecolumncount == 1) {
                    ImageView middleimage2 = (ImageView) findViewById(R.id.imageView5);
                    middleimage2.setImageResource(R.drawable.redcounter);
                } else if (middlecolumncount == 2) {
                    ImageView middleimage3 = (ImageView) findViewById(R.id.imageView2);
                    middleimage3.setImageResource(R.drawable.redcounter);
                }
            }
            middlecolumncount++;
            break;
        }

        case R.id.rightcolumnred: {
            if (rightcolumncount < 3) {
                if (rightcolumncount == 0) {
                    ImageView rightimage1 = (ImageView) findViewById(R.id.imageView9);
                    rightimage1.setImageResource(R.drawable.redcounter);
                } else if (rightcolumncount == 1) {
                    ImageView rightimage2 = (ImageView) findViewById(R.id.imageView6);
                    rightimage2.setImageResource(R.drawable.redcounter);
                } else if (rightcolumncount == 2) {
                    ImageView rightimage3 = (ImageView) findViewById(R.id.imageView3);
                    rightimage3.setImageResource(R.drawable.redcounter);
                }
            }
            rightcolumncount++;
            break;
        }

        case R.id.leftcolumnyellow: {
            if (leftcolumncount < 3) {
                if (leftcolumncount == 0) {
                    ImageView leftimage1 = (ImageView) findViewById(R.id.imageView7);
                    leftimage1.setImageResource(R.drawable.yellowcounter);
                } else if (leftcolumncount == 1) {
                    ImageView leftimage2 = (ImageView) findViewById(R.id.imageView4);
                    leftimage2.setImageResource(R.drawable.yellowcounter);
                } else if (leftcolumncount == 2) {
                    ImageView leftimage3 = (ImageView) findViewById(R.id.imageView);
                    leftimage3.setImageResource(R.drawable.yellowcounter);
                }
            }
            leftcolumncount++;
            break;
        }

        case R.id.middlecolumnyellow: {
            if (middlecolumncount < 3) {
                if (middlecolumncount == 0) {
                    ImageView middleimage1 = (ImageView) findViewById(R.id.imageView8);
                    middleimage1.setImageResource(R.drawable.yellowcounter);
                } else if (middlecolumncount == 1) {
                    ImageView middleimage2 = (ImageView) findViewById(R.id.imageView5);
                    middleimage2.setImageResource(R.drawable.yellowcounter);
                } else if (middlecolumncount == 2) {
                    ImageView middleimage3 = (ImageView) findViewById(R.id.imageView2);
                    middleimage3.setImageResource(R.drawable.yellowcounter);
                }
            }
            middlecolumncount++;
            break;
        }

        case R.id.rightcolumnyellow: {
            if (rightcolumncount < 3) {
                if (rightcolumncount == 0) {
                    ImageView rightimage1 = (ImageView) findViewById(R.id.imageView9);
                    rightimage1.setImageResource(R.drawable.yellowcounter);
                } else if (rightcolumncount == 1) {
                    ImageView rightimage2 = (ImageView) findViewById(R.id.imageView6);
                    rightimage2.setImageResource(R.drawable.yellowcounter);
                } else if (rightcolumncount == 2) {
                    ImageView rightimage3 = (ImageView) findViewById(R.id.imageView3);
                    rightimage3.setImageResource(R.drawable.yellowcounter);
                }
            }
            rightcolumncount++;
            break;
        }
    }
}
    public void reset(View view) {
        leftcolumncount = 0;
        middlecolumncount = 0;
        rightcolumncount = 0;
        GridLayout grid = (GridLayout) findViewById(R.id.imagegrid);
        for (int i = 0; i < grid.getChildCount(); i++) {
            ((ImageView) grid.getChildAt(i)).setImageResource(0);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
