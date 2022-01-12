import { ReactComponent as GitHubIcon } from '../../assets/img/github.svg'
import './styles.css'

function NavBar() {

  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <h1>DSMovie</h1>
          <a href="https://github.com/GustavoTreccia" target='_blank' rel='noreferrer'>
            <div className='dsmovie-contact-container'>
              <GitHubIcon />
              <p className='dsmovie-contact-link'>/gustavotreccia</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default NavBar;