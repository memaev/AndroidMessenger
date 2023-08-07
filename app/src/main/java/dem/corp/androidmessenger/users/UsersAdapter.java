package dem.corp.androidmessenger.users;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import dem.corp.androidmessenger.R;

public class UsersAdapter extends RecyclerView.Adapter<UserViewHolder>{

    private ArrayList<User> users = new ArrayList<>();

    public UsersAdapter(ArrayList<User> users){
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_item_rv, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.username_tv.setText(users.get(position).username);

        if (!users.get(position).profileImage.isEmpty()){
            Glide.with(holder.itemView.getContext()).load(users.get(position).profileImage).into(holder.profileImage_iv);
        }
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
