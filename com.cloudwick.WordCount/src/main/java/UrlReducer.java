import java.io.IOException;

import java.util.HashSet;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;
public class UrlReducer extends Reducer<Text, Text, Text, IntWritable>{
	
	protected void reduce(Text key, Iterable<Text> ipList,
			Context context) throws IOException, InterruptedException {
		int sum = 0;
		HashSet<String> ips = new HashSet<String>();
		
		for (Text val : ipList) {
			
			ips.add(val.toString());
			
		}
		sum=ips.size();
	
		context.write(key, new IntWritable(sum));
	}

}
