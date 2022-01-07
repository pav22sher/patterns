package behavioral_patterns.iterator.example2.channel;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Channel {
    private double frequency;
    private ChannelTypeEnum TYPE;
}
