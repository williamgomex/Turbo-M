package com.zoomcreativo.turbo_m;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.zoomcreativo.turbo_m.dummy.DummyContent;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            switch(Integer.parseInt(mItem.id)){
                case 1:
                    ((TextView) rootView.findViewById(R.id.titulo1)).setText(R.string.hotel1tit);
                    ((TextView) rootView.findViewById(R.id.titulo2)).setText(R.string.hotel2tit);
                    ((TextView) rootView.findViewById(R.id.titulo3)).setText(R.string.hotel3tit);
                    ((TextView) rootView.findViewById(R.id.texto1)).setText(R.string.hotel1text);
                    ((TextView) rootView.findViewById(R.id.texto2)).setText(R.string.hotel2text);
                    ((TextView) rootView.findViewById(R.id.texto3)).setText(R.string.hotel3text);
                    ((ImageView) rootView.findViewById(R.id.imagen1)).setImageResource(R.drawable.costasol);
                    ((ImageView) rootView.findViewById(R.id.imagen2)).setImageResource(R.drawable.castilla);
                    ((ImageView) rootView.findViewById(R.id.imagen3)).setImageResource(R.drawable.simonadelmar);
                    ((TextView) rootView.findViewById(R.id.texto4)).setVisibility(View.GONE);
                    ((TextView) rootView.findViewById(R.id.texto5)).setVisibility(View.GONE);
                    ((TextView) rootView.findViewById(R.id.texto6)).setVisibility(View.GONE);
                    break;

                case 2:
                    ((TextView) rootView.findViewById(R.id.titulo1)).setText(R.string.bar1tit);
                    ((TextView) rootView.findViewById(R.id.titulo2)).setText(R.string.bar2tit);
                    ((TextView) rootView.findViewById(R.id.titulo3)).setText(R.string.bar3tit);
                    ((TextView) rootView.findViewById(R.id.texto1)).setText(R.string.bar1text);
                    ((TextView) rootView.findViewById(R.id.texto2)).setText(R.string.bar2text);
                    ((TextView) rootView.findViewById(R.id.texto3)).setText(R.string.bar3text);
                    ((ImageView) rootView.findViewById(R.id.imagen1)).setImageResource(R.drawable.tilipias);
                    ((ImageView) rootView.findViewById(R.id.imagen2)).setImageResource(R.drawable.discotecaextasis);
                    ((ImageView) rootView.findViewById(R.id.imagen3)).setImageResource(R.drawable.simona);
                    ((TextView) rootView.findViewById(R.id.texto4)).setVisibility(View.GONE);
                    ((TextView) rootView.findViewById(R.id.texto5)).setVisibility(View.GONE);
                    ((TextView) rootView.findViewById(R.id.texto6)).setVisibility(View.GONE);
                    break;

                case 3:
                    ((TextView) rootView.findViewById(R.id.titulo1)).setText(R.string.tur1tit);
                    ((TextView) rootView.findViewById(R.id.titulo2)).setText(R.string.tur2tit);
                    ((TextView) rootView.findViewById(R.id.titulo3)).setText(R.string.tur3tit);
                    ((TextView) rootView.findViewById(R.id.texto1)).setText(R.string.tur1text);
                    ((TextView) rootView.findViewById(R.id.texto2)).setText(R.string.tur2text);
                    ((TextView) rootView.findViewById(R.id.texto3)).setText(R.string.tur3text);
                    ((ImageView) rootView.findViewById(R.id.imagen1)).setImageResource(R.drawable.katios);
                    ((ImageView) rootView.findViewById(R.id.imagen2)).setImageResource(R.drawable.bahicolo);
                    ((ImageView) rootView.findViewById(R.id.imagen3)).setImageResource(R.drawable.atratocorre);
                    ((TextView) rootView.findViewById(R.id.texto4)).setVisibility(View.GONE);
                    ((TextView) rootView.findViewById(R.id.texto5)).setVisibility(View.GONE);
                    ((TextView) rootView.findViewById(R.id.texto6)).setVisibility(View.GONE);
                    break;

                case 4:
                    ((TextView) rootView.findViewById(R.id.titulo1)).setText(R.string.demotit);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT);
                    lp.setMargins(10, 0, 10, 0);
                    ((LinearLayout) rootView.findViewById(R.id.layout1)).setLayoutParams(lp);
                    ((LinearLayout) rootView.findViewById(R.id.layout2)).setLayoutParams(lp);
                    ((LinearLayout) rootView.findViewById(R.id.layout3)).setLayoutParams(lp);
                    ((TextView) rootView.findViewById(R.id.titulo2)).setVisibility(View.GONE);
                    ((TextView) rootView.findViewById(R.id.titulo3)).setVisibility(View.GONE);
                    ((TextView) rootView.findViewById(R.id.texto1)).setText(R.string.demotext);
                    ((TextView) rootView.findViewById(R.id.texto2)).setText(R.string.demo1text);
                    ((TextView) rootView.findViewById(R.id.texto3)).setText(R.string.demo2text);
                    ((TextView) rootView.findViewById(R.id.texto4)).setText(R.string.demo3text);
                    ((TextView) rootView.findViewById(R.id.texto5)).setText(R.string.demo4text);
                    ((TextView) rootView.findViewById(R.id.texto6)).setText(R.string.demo5text);
                    ((ImageView) rootView.findViewById(R.id.imagen1)).setImageResource(R.drawable.demografia);
                    ((ImageView) rootView.findViewById(R.id.imagen2)).setVisibility(View.GONE);
                    ((ImageView) rootView.findViewById(R.id.imagen3)).setVisibility(View.GONE);

                    break;
                default:
                    break;
            }
            //((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.content);
        }

        return rootView;
    }
}
