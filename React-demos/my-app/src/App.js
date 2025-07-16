//import logo from './logo.svg';
import './App.css';
import Gallery from './gallery';
import GalleryOne from './galleryOne';
function App() {
  return (
    <div className="App">
      <header className="App-header">
        {/* <Gallery/> */}
        <GalleryOne/>
        <GalleryOne/>
      </header>
    </div>
  );
}

export default App;
