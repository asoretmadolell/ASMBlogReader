package com.utad.asmblogreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.utad.asmblogreader.model.PostList;

/*************************************************************/
/*                                                           */ 
/* PostListAdapter                                           */ 
/* (c)2014 Alejandro                                         */ 
/*                                                           */ 
/* Description: PostListAdapter Class                        */ 
/*              ASMBlogReader Project                        */ 
/*                                                           */ 
/*                                                           */ 
/*************************************************************/
public class PostListAdapter extends BaseAdapter 
{
	private Context ctx;
	private PostList postList;
	
	public PostListAdapter( Context context, PostList postList )
	{
		this.postList = postList;
		this.ctx = context;
	}
	
	@Override
	public int getCount() {
		return postList.getPosts().size();
	}

	@Override
	public Object getItem(int position) {
		return postList.getPosts().get(position);
	}

	@Override
	public long getItemId(int position) {
		return postList.getPosts().get(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View itemLayout = null;
		
		if (convertView != null)
		{
			itemLayout = convertView;
		}
		else
		{
			LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			itemLayout = inflater.inflate(R.layout.post_list_item, null);
		}
		
		TextView title = (TextView)itemLayout.findViewById(R.id.title);
		title.setText(postList.getPosts().get(position).getTitle());
		
		return itemLayout;
	}

}
