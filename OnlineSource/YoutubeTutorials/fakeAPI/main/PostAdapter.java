package com.example.retrofittutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Retrofit;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    // RecycleView is a ViewGroup that renders an adapter-based view in a similar way
    // The adapter is the piece that will connect our data to our RecyclerView and determine
    // the ViewHolder(s) which will need to be used to display that data.

    Context context;
    List<Post> postList;


    public PostAdapter(Context context, List<Post> posts) {

        this.context = context;
        postList = posts;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // xml 파일을 객체화 시키기 위한 준비
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        // inflate(int resource, ViewGroup root, boolean attachToRoot)
        // resource : view 를 만들고 싶은 레이아웃 파일의 id
        // root : attachToRoot 가 true 일 경우 생성되는 View 가 추가될 부모 뷰,
        //        attachToRoot 가 false 일 경우 LayoutParams 값을 설정 해주기 위한 상위 뷰
        //        attachToRoot 가 null 로 설정할 경우 android:layout_xxxx 값들이 무시됨

        // LayoutInflater
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
    // onBindViewHolder(VH holder, int position) called by RecyclerView to display the data at the specified position.
        Post post = postList.get(position);
        holder.id.setText(post.getId());
        holder.userId.setText(post.getUserId());
        holder.title.setText(post.getTitle());
        holder.body.setText(post.getBody());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{

        TextView title, id, userId, body;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title_tv);
            id = itemView.findViewById(R.id.id_tv);
            userId = itemView.findViewById(R.id.user_id_tv);
            body = itemView.findViewById(R.id.body_tv);

        }
    }

}
