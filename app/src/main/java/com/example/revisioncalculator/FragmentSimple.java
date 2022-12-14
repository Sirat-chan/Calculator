package com.example.calculateura2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.revisioncalculator.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentSimple#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentSimple extends Fragment {

    EditText edt1, edt2;
    Button btnadd, btnsub, btnmul, btndiv;
    TextView txtv;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentSimple() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentSimple.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentSimple newInstance(String param1, String param2) {
        FragmentSimple fragment = new FragmentSimple();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inf = inflater.inflate(R.layout.fragment_simple, container, false);

        edt1 = inf.findViewById(R.id.fop1);
        edt2 = inf.findViewById(R.id.fop2);
        txtv = inf.findViewById(R.id.simpleres);
        btnadd = inf.findViewById(R.id.add);
        btnsub = inf.findViewById(R.id.sous);
        btnmul = inf.findViewById(R.id.mul);
        btndiv = inf.findViewById(R.id.div);

        //R??cup??rer la chaine de caract??re "Result = " ?? partir du fichier strings.xml
        String msg = getResources().getString(R.string.res);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int opadd = Integer.valueOf(edt1.getText().toString()) + Integer.valueOf(edt2.getText().toString());
                txtv.setText(msg + opadd);
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int opsous = Integer.valueOf(edt1.getText().toString()) - Integer.valueOf(edt2.getText().toString());
                txtv.setText(msg + opsous);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int opmul = Integer.valueOf(edt1.getText().toString()) * Integer.valueOf(edt2.getText().toString());
                txtv.setText(msg + opmul);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double opdiv=0;
                int o1 = Integer.valueOf(edt1.getText().toString());
                int o2 = Integer.valueOf(edt2.getText().toString());
                if(o2 != 0) {
                    opdiv = (double)o1 / (double)o2;
                }else{
                    Toast.makeText(getContext(), "Op??ration impossible avec op??rande 2 = 0 !", Toast.LENGTH_LONG).show();
                }
                txtv.setText(msg + opdiv);
            }
        });
        // Inflate the layout for this fragment
        return inf;
    }
}