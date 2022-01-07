package behavioral_patterns.iterator.example2.channel;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection{
    private final List<Channel> channels = new ArrayList<>();
    @Override
    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }
    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, channels);
    }
}
