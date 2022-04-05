package org.sg.holdem.entity;

import org.sg.holdem.domain.Card;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    String id;
    int playerNum;
    Map<String, List<Card>> players;
    List<Card> cards;

    @Override
    public String toString() {
        return "[id:" + this.id + ", players:" + this.players + "]";
    }
}
