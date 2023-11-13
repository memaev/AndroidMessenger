package dem.corp.androidmessenger.bottomnav.chats;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import dem.corp.androidmessenger.chats.Chat;
import dem.corp.androidmessenger.chats.ChatsAdapter;
import dem.corp.androidmessenger.databinding.FragmentChatsBinding;

public class ChatsFragment extends Fragment {
    private FragmentChatsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentChatsBinding.inflate(inflater, container, false);

        loadChats();

        return binding.getRoot();
    }

    private void loadChats(){
        ArrayList<Chat> chats = new ArrayList<Chat>();
        chats.add(new Chat("123", "Test chat 1", "123123", "123456"));
        chats.add(new Chat("124", "Test chat 2", "123123", "123456"));
        chats.add(new Chat("125", "Test chat 3", "123123", "123456"));

        binding.chatsRv.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.chatsRv.setAdapter(new ChatsAdapter(chats));
    }
}
