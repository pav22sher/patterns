package behavioral_patterns.iterator.example2.channel;

public interface ChannelCollection {
    void addChannel(Channel channel);
    ChannelIterator iterator(ChannelTypeEnum type);
}
