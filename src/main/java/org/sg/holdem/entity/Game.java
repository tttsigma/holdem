package org.sg.holdem.entity;

import org.sg.holdem.domain.Card;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document("game")
public class Game {
    private String id;
    private Integer playerNum;
    private Map<String, List<Card>> players;
    private List<Card> cards;

    @Override
    public String toString() {
        return "[id:" + this.id + ", players:" + this.players + "]";
    }
}
