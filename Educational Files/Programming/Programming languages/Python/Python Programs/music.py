import pymedia
import time

demuxer = pymedia.muxer.Demuxer('mp3') #this thing decodes the multipart file i call it a demucker

f = open(r"path to \song.mp3", 'rb')


spot = f.read()
frames = demuxer.parse(spot)
print ('read it has %i frames' % len(frames))
decoder = pymedia.audio.acodec.Decoder(demuxer.streams[0]) #this thing does the actual decoding
frame = decoder.decode(spot)
print (dir(frame))
#sys.exit(1)
sound = pymedia.audio.sound
print (frame.bitrate, frame.sample_rate)
song = sound.Output( frame.sample_rate, frame.channels, 16 ) #this thing handles playing the song

while len(spot) > 0:
    try:
        if frame: song.play(frame.data)
        spot = f.read(512)
        frame = decoder.decode(spot)
    except:
        pass

while song.isPlaying(): time.sleep(.05)
print ('well done')