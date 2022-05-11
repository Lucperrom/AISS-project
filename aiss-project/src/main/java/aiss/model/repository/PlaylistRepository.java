package aiss.model.repository;

import java.util.Collection;

import aiss.model.Playlist;
import aiss.model.Person;

public interface PlaylistRepository {
	
	
	// Songs
	public void addSong(Person s);
	public Collection<Person> getAllSongs();
	public Person getSong(String songId);
	public void updateSong(Person s);
	public void deleteSong(String songId);
	
	// Playlists
	public void addPlaylist(Playlist p);
	public Collection<Playlist> getAllPlaylists();
	public Playlist getPlaylist(String playlistId);
	public void updatePlaylist(Playlist p);
	public void deletePlaylist(String playlistId);
	public Collection<Person> getAll(String playlistId);
	public void addSong(String playlistId, String songId);
	public void removeSong(String playlistId, String songId); 

	
	
	
	

}
