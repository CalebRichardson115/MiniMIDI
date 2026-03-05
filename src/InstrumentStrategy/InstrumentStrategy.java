package instrumentStrategy;

import javax.sound.midi.*;
/*Changes the instrument for a channel to Electric Base Guitar at tick 0.
 any class applying this strategy uses the PROGRAM_CHANGE ShortMessage which is used for changing instruments.
*/
public interface InstrumentStrategy {
	void applyInstrument(Track track, int channel);
}
