package koejad20.bplaced.net.genderequalibrium.bl;

import koejad20.bplaced.net.genderequalibrium.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterUSSR extends RecyclerView.Adapter<HolderUSSR> {
    private final List<USSR> ussrs;
    private final LayoutInflater flate;

    public AdapterUSSR(@NonNull final List<USSR> ussrs, @NonNull final LayoutInflater flate) {
        this.ussrs = ussrs;
        this.flate = flate;
    }

    @NonNull
    @Override
    public HolderUSSR onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View USSRViewer = flate.inflate(R.layout.ussr_layer_switch, parent, false);
        return new HolderUSSR(USSRViewer);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderUSSR holder, int position) {

    }

    @Override
    public int getItemCount() {
        return ussrs.size();
    }
}
