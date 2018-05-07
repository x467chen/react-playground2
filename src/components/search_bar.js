import React,{Component} from 'react';

// const SearchBar = ()=>{
//   return <input />;
// };

class SearchBar extends Component{
  constructor(props){
    super(props);

    this.state ={term:''};
  }

  // onInputChange(event){
  //   event.target.value
  // }
  render(){
    // return <input onChange={this.onInputChange} />
    // return <input onChange={event => console.log(event.target.value)} />

    return(
        <div>
          <input onChange={event => this.setState({term:event.target.value})} />
          Value of In put: {this.state.term}
      </div>
    );
  }

}

export default SearchBar;
