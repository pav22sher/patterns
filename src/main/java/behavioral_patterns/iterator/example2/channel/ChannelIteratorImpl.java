package behavioral_patterns.iterator.example2.channel;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator{
    private final ChannelTypeEnum type;
    private final List<Channel> channels;
    private int position;

    public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
        this.type = type;
        this.channels = channels;
    }

    @Override
    public boolean hasNext() {
        while (position < channels.size()) {
            Channel channel = channels.get(position);
            if (channel.getTYPE().equals(type) || ChannelTypeEnum.ALL.equals(type)) {
                return true;
            } else {
                position++;
            }
        }
        return false;
    }

    @Override
    public Channel next() {
        return channels.get(position++);
    }
}
